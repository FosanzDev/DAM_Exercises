package com.fosanzdev.T10.ArrayHashMap;

public class Node<K, V>{

        protected final K key;
        protected V value;
        protected int offset;

        public Node(K key, V value, int offset){
            this.key = key;
            this.value = value;
            this.offset = offset;
        }
}
