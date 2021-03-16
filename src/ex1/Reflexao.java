package ex1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflexao {

	public static void refletirObjeto(Object objeto, Class classe) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("===========================");
		System.out.println("Nome da classe: "+classe.getName());
		System.out.println("Nome da classe (simples): "+classe.getSimpleName());
		System.out.println("Nome canônico da classe :"+classe.getResource(classe.getName()));
		
		System.out.println("Tipo: "+classe.getTypeName());
		
		System.out.println("===========================");
		System.out.println("=========ATRIBUTOS=========");
		
		Field[] atributos = classe.getDeclaredFields();
		for(Field f: atributos) {
			f.setAccessible(true);
			
			if(f.getType().isPrimitive()) {
				f.set(objeto, 0);
			} else {
				f.set(objeto, null);
			}
			System.out.println(f.getName()+ ": "+f.getType().getTypeName()
					+" (primitivo: "+f.getType().isPrimitive()+")"
					+" -> Valor: "+f.get(objeto));
		}
		System.out.println("===========================");
		System.out.println("==========METODOS==========");
		
		Method[] metodos = classe.getDeclaredMethods();
		
		for(Method m: metodos) {
			System.out.println(m.getName()+" - parâmetros: "+ Arrays.toString(m.getParameterTypes())
				+ " - retorno: "+m.getReturnType().getSimpleName());
		}
	}
}
