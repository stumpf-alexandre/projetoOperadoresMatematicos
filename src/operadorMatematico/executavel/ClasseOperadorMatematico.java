package operadorMatematico.executavel;

import javax.swing.JOptionPane;

public class ClasseOperadorMatematico {
	public static void main(String[] args) {
		mediaNota();
		//divisao();
	}
	public static void divisao() {
		/*resto da divisão*/
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNum / pessoaNum);
		
		double resto = carroNum % pessoaNum;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão ?");
		if (resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu : " + divisao);
		}
		else {
			JOptionPane.showMessageDialog(null, "Não quer ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão ?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobrou de resto da divisão : " + resto);
		}
		else {
			JOptionPane.showMessageDialog(null, "Não quer ver o resultado");
		}
		System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros.");
	}
	
	public static void mediaNota() {
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2 ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4 ");
		
		double notaReal1 = Double.parseDouble(nota1);
		double notaReal2 = Double.parseDouble(nota2);
		double notaReal3 = Double.parseDouble(nota3);
		double notaReal4 = Double.parseDouble(nota4);
		
		double media = (notaReal1 + notaReal2 + notaReal3 + notaReal4)/4;
		
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de : " + media);
			}
			else {
				JOptionPane.showMessageDialog(null, "Aluno está em recuperação com média de : " + media);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de : " + media);
		}
	}
}
