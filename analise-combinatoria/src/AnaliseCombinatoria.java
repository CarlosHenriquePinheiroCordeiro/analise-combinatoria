
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
		return auxiliarDivisao(getTotalElementos(), (getTotalElementos() - getElementosSelecionados()));
	}
	
	/**
	 * Fun��o que calcula a combinacao
	 * @return o c�lculo da combina��o
	 */
	public int combinacao() {
		return auxiliarDivisao(getTotalElementos(), getElementosSelecionados()) / (fatorial(getTotalElementos() - getElementosSelecionados()));
	}
	
	/**
	 * Fun��o que realiza a divis�o para o Arranjo, de forma matem�tica formal
	 * @param numerador
	 * @param denominador
	 * @return
	 */
	public int auxiliarDivisao(int numerador, int denominador) {
		int resultado = numerador;
		for (int x = numerador - 1; x > denominador; x--) {
			resultado = resultado * x;
		}
		return resultado;
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
