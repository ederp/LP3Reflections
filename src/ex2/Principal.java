package ex2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Principal {

	public static void main(String[] args) {
		try {
			Class minhaClasse = Class.forName("profmateria.Materia");
			Object meuObjeto = minhaClasse.getConstructor().newInstance();
			
			Field f = meuObjeto.getClass().getDeclaredField("idMateria");
			f.setAccessible(true);
			f.set(meuObjeto, 22222);
			
			f = meuObjeto.getClass().getDeclaredField("nome");
			f.setAccessible(true);
			f.set(meuObjeto, "Linguagem de Programação III");
			
			f = meuObjeto.getClass().getDeclaredField("curso");
			f.setAccessible(true);
			f.set(meuObjeto, "Tecnologia em Analise e Desenvolvimento de Sistemas");
			
			f = meuObjeto.getClass().getDeclaredField("periodo");
			f.setAccessible(true);
			f.set(meuObjeto, "noturno");
			
			Class minhaClasse2 = Class.forName("profmateria.Professor");
			Object meuObjeto2 = minhaClasse2.getConstructor().newInstance();
			
			f = meuObjeto2.getClass().getDeclaredField("nome");
			f.setAccessible(true);
			f.set(meuObjeto2, "Johnata Souza Santicioli");
			
			f = meuObjeto2.getClass().getDeclaredField("matricula");
			f.setAccessible(true);
			f.set(meuObjeto2, 333333);
			
			f = meuObjeto2.getClass().getDeclaredField("endereco");
			f.setAccessible(true);
			f.set(meuObjeto2, "Rua abcd, 123");
			
			Reflexao.refletirObjeto(meuObjeto, minhaClasse);
			Reflexao.refletirObjeto(meuObjeto2, minhaClasse2);
			
		} catch (ClassNotFoundException|InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException e) {
			e.printStackTrace();
		}
		
	}

}
