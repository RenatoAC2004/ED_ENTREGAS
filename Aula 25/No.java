
public class No {
	
	int Conteudo;
	No Esquerdo;
	No Direito;
	No raiz;
	
	public No(int conteudo) {
		this.Conteudo = conteudo;
		this.Esquerdo = null;
		this.Direito = null;
	}

	public No inserirValor(No novo, No anterior){
		if(raiz == null) {
			this.raiz = novo;
		}
		
		if(anterior != null) {
			if (novo.Conteudo <= anterior.Conteudo) {
                anterior.Esquerdo = this.inserirValor(novo, anterior.Esquerdo);
            } else if (novo.Conteudo > anterior.Conteudo) {
                anterior.Direito = this.inserirValor(novo, anterior.Direito);
            } else {
                return null;
            }
        } else {
            anterior = novo;
        }

        return anterior;
    }
	
	public void consulta(No no) {
	    if (no != null) {
	        consulta(no.Esquerdo);
	        System.out.println(no.Conteudo);
	        consulta(no.Direito);
	    }
	}
	
}
		
		
		


	