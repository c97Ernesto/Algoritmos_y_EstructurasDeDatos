package tp2.ejercicio01;

public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * 
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * 
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty() {
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}

	public boolean hasLeftChild() {
		return this.leftChild != null;
	}

	public boolean hasRightChild() {
		return this.rightChild != null;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}

	//contarHojas():int Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
	public int contarHojas() {
		int total = 0;
		
		if (this.isLeaf()) {
			total = 1;
		}
		else
			if (this.hasLeftChild())
				total = this.getLeftChild().contarHojas();
		
			if (this.hasRightChild())
				total+= this.getRightChild().contarHojas();
		
		return total;
	}

	//espejo(): BinaryTree<T> Devuelve el árbol binario espejo del árbol receptor.
	public BinaryTree<T> espejo() {
		BinaryTree<T> nodo = new BinaryTree<T>(this.getData());
		
		if (!this.isLeaf()) {
						
			if (this.hasLeftChild()) {
				nodo.addRightChild(this.getLeftChild().espejo());
				
			}
			if (this.hasRightChild()) {
				nodo.addLeftChild(this.getRightChild().espejo());
			}					
		}
		
		return  nodo;
	}

	// 0<=n<=m
	public void entreNiveles(int n, int m) {

	}

}
