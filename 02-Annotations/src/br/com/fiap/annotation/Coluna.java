package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//� poss�vel recuperar a anota��o at� a execu��o
@Retention(RetentionPolicy.RUNTIME)
//Anota��o serve para atributos
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Coluna {

	String nome();
	
}
