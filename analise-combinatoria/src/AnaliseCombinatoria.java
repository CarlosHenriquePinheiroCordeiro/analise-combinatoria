
public class AnaliseCombinatoria {
	
	private int totalElementos;
	private int elementosSelecionados;
	
	public AnaliseCombinatoria(int totalElementos) {
		setTotalElementos(totalElementos);
	}
	
	/**
	 * Função que calcula o arranjo
	 * @return o cálculo do arranjo
	 */
	public int arranjo() {
		return permutacao() / (fatorial(getTotalElementos() - getElementosSelecionados()));
	}
	
	/**
	 * Função que calcula a combinacao
	 * @return o cálculo da combinação
	 */
	public int combinacao() {
		return permutacao() / (fatorial(getElementosSelecionados()) * (fatorial(getTotalElementos() - getElementosSelecionados())));
	}
	
	/**
	 * Retorna o resultado da permutação
	 * @return
	 */
	public int permutacao() {
		return fatorial(getTotalElementos());
	}
	
	/**
	 * Função recursiva que calcula o fatorial de um dado número
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
