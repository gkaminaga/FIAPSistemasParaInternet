package br.fiap.com.teste;

import javax.swing.JOptionPane;

import br.fiap.com.excecao.Excecao;

public class TesteExcecao {
	public static void main(String[] args) {
		int x = 0;

		try {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			System.out.println("Número inserido foi: " + x);
		} catch (Exception e) {
			System.out.println(Excecao.trataExcecao(e));
		} finally {
			System.out.println("Até logo");
		}
	}
}
