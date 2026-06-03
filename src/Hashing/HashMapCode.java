package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] bucket; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i = 0; i < this.N; i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % this.N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = bucket[bi];

            for (int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node>[] oldBucket = this.bucket;
            this.bucket = new LinkedList[this.N*2];

            for(int i = 0; i < this.N*2; i++){
                bucket[i] = new LinkedList<>();
            }

            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key); // bucket-index
            int di = searchInLL(key, bi); // data-index di = -1

            if(di == -1){ // key doesn't exist
                bucket[bi].add(new Node(key, value));
                n++;
            } else{ // key exists
                Node node = bucket[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                // rehashing
                rehash();
            }

        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) return false;
            else return true;
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) return null;
            else{
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            } else{
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 210);
        map.put("Japan", 210);

        ArrayList<String> keys = map.keySet();
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
