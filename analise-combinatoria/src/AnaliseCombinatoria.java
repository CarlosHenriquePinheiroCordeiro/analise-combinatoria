
public class AnaliseCombinatoria {
	
	private int totalElementos;
	private int elementosSelecionados;
	
	public AnaliseCombinatoria(int totalElementos) {
		setTotalElementos(totalElementos);
	}
	
	/**
	 * Fun��o que calcula o arranjo
	 * @return o c�lculo do arranjo
	 */
	public int arranjo() {
		return permutacao() / (fatorial(getTotalElementos() - getElementosSelecionados()));
	}
	
	/**
	 * Fun��o que calcula a combinacao
	 * @return o c�lculo da combina��o
	 */
	public int combinacao() {
		return permutacao() / (fatorial(getElementosSelecionados()) * (fatorial(getTotalElementos() - getElementosSelecionados())));
	}
	
	/**
	 * Retorna o resultado da permuta��o
	 * @return
	 */
	public int permutacao() {
		return fatorial(getTotalElementos());
	}
	
	/**
	 * Fun��o recursiva que calcula o fatorial de um dado n�mero
	 * @param num
	 * @return o fatorial de 'num'
	 */
	public int fatorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);
	}

	public int getTotalElementos() {
		return totalElementos;
	}

	public void setTotalElementos(int totalElementos) {
		this.totalElementos = totalElementos;
	}

	public int getElementosSelecionados() {
		return elementosSelecionados;
	}

	public void setElementosSelecionados(int elementosSelecionados) {
		this.elementosSelecionados = elementosSelecionados;
	}
	
	
}
