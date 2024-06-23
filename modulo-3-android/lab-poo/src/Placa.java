public class Placa {
	String placa;
	int tipo;
	
	Placa(){
		this("",0);
	}
	
	Placa(String placa, int tipo){
		this.placa = placa;
		this.tipo = tipo;
	}
	
	String getTipoString() {
		switch (tipo) {
		case 1: {
			return "Normal";
		}
		case 2: {
			return "Servico";
		}
		case 3: {
			return "Oficial";
		}
		case 4: {
			return "Escola";
		}
		case 5: {
			return "Prototipo";
		}
		case 6: {
			return "Colecionador";
		}
		default:
			return "Outros";
		}
	}
	
	boolean temEstacionamentoLivre() {
		if(this.tipo ==  2 || this.tipo ==  3) {
			return true;
		}
		return false;
	}
	
	String getDescricao() {
		return "Placa: placa="+ this.placa +", tipo=" + this.getTipoString() + ", estacionamentoLivre=" + this.temEstacionamentoLivre() + ".";
	}
}
