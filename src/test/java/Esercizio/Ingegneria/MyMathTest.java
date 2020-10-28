package Esercizio.Ingegneria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MyMathTest 
{
	private static MyMath math;
	
	@BeforeClass
	public static void prepare() {
		math = new MyMath();
	}
	
	@Test
	public void primeNumbersGeneratorWorks()
	{
		//inserendo un numero minore di due(imput) deve restituire una lista vuota(valore atteso)
		assertEquals(new LinkedList<>(),(math.primeNumbersGeneretor(1)));
		
		//inserendo i numeri primi da 1 a 20 i numeri attesi sono: 2,3,5,7,11,13,17,19
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19),math.primeNumbersGeneretor(20));
	}
	
	@Test
	public void isPrimeWorks()
	{
		assertTrue(math.isPrime(2));
		//insert un numero < 2 l'output atteso è falso
		assertFalse(math.isPrime(1));
		assertFalse(math.isPrime(9));
		
		List<Integer> primes= Arrays.asList(11,13,17,31);
		for(int prime: primes)
			assertTrue(math.isPrime(prime));
	}
}
