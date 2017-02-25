package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.bean.Aluno;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		//Recuperar os m�todos da classe aluno
		Method[] metodos = 
			aluno.getClass().getDeclaredMethods();
		System.out.println("M�todos da classe:");
		//Imprimir o nome dos m�todos
		for (Method method : metodos) {
			System.out.println(method.getName());
		}
		
		//Recuperar e exibir o nome dos atributos
		Field[] atributos = 
			aluno.getClass().getDeclaredFields();
		System.out.println("Atributos da classe:");
		for (Field field : atributos) {
			//Recuperar a anota��o
			Coluna anotacao = 
				field.getAnnotation(Coluna.class);
			System.out.println(field.getName() +
					" -> " + anotacao.nome());
		}
		
	}
	
}