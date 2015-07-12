import java.util.HashMap;

public class LRUCache<K, V> {
	private final int Max_CACHE_CAPACITY;
	private Entry<K, V> first;
	private Entry<K, V> last;
	private HashMap<K, Entry<K, V>> hashmap = new HashMap<K, Entry<K, V>>();

	public LRUCache(int capacity) {
		this.Max_CACHE_CAPACITY = capacity;
	}

	public V get(K key) {
		Entry<K, V> entry = getEntry(key);
		if(entry == null)
			return null;
		moveToFirst(entry);
		return entry.value;
	}

	public void set(K key, V value) {
		Entry<K, V> entry = getEntry(key);
		if (entry == null) {
			if (hashmap.size() >= Max_CACHE_CAPACITY) {
				hashmap.remove(last.key);
				removeLast();
			}

			entry = new Entry<K, V>();
			entry.key = key;
		}

		entry.value = value;
		moveToFirst(entry);
		hashmap.put(key, entry);
	}

	private void moveToFirst(Entry<K, V> entry) {
		if (entry == first)
			return;
		if (entry.pre != null)
			entry.pre.next = entry.next;
		if (entry.next != null) {
			entry.next.pre = entry.pre;
		}
		if (entry == last)
			last = last.pre;

		if (first == null || last == null) {
			first = last = entry;
		}

		entry.next = first;
		first.pre = entry;
		first = entry;
		entry.pre = null;

	}

	private void removeLast() {
		if (last != null) {
			last = last.pre;
			if (last == null) {
				first = null;
			} else {
				last.next = null;
			}
		}

	}

	private Entry<K, V> getEntry(K key) {
		return hashmap.get(key);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Entry<K, V> entry = first;
		while(entry != null){
			System.out.println(String.format("%s:%s", entry.key,entry.value));
			entry = entry.next;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		LRUCache<Integer, String> cache = new LRUCache<Integer, String>(3);
		cache.set(1, "a");
		cache.set(2, "b");
		cache.set(3, "c");
		cache.get(1);
		cache.set(4, "d");
		System.out.println(cache);
	}
}
class Entry<K, V> {
	public Entry<K, V> pre;
	public Entry<K, V> next;
	public K key;
	public V value;
}

