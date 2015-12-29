package eu.rossng.clrs.heap

public class Heap<T> (val baseArray: Array<T>, val heapSize: Int) {

    fun root(): HeapEntry<T>? {
       return if (heapSize > 0)
           HeapEntry(0, baseArray[0]) else null
    }

    fun getParent(index: Int): HeapEntry<T>? {
        return if (index > 1 && index <= heapSize)
            HeapEntry(index/2, baseArray[index/2 - 1]) else null
    }

    fun getLeft(index: Int): HeapEntry<T>? {
        return if (index >= 1 && index*2 <= heapSize)
            HeapEntry(index*2, baseArray[index*2 - 1]) else null
    }

    fun getRight(index: Int): HeapEntry<T>? {
        return if (index >= 1 && index*2+1 <= heapSize)
            HeapEntry(index*2 + 1, baseArray[index*2]) else null
    }
}