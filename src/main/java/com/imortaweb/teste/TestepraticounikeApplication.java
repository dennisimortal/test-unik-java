package com.imortaweb.teste;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestepraticounikeApplication {

	static Scanner sc = new Scanner(System.in);

	public TestepraticounikeApplication(long l, Object object) {

	}

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			numeros.add(sc.nextInt());
		}

		Map<Integer, List<Integer>> cont = new LinkedHashMap<>();
		for (int i = 0; i < numeros.size(); i++) {
			int n1 = numeros.get(i);
			if (!cont.containsKey(n1)) {
				cont.put(n1, new ArrayList<>());
			}

			cont.get(n1).add(i);
		}

		for (Entry<Integer, List<Integer>> entry : cont.entrySet()) {
			List<Integer> posicoes = entry.getValue();
			if (posicoes.size() > 1) {
				System.out.printf("Número %d se repete %d vezes nas posições: %s\n", entry.getKey(), posicoes.size(),
						posicoes);
			}
		}
	} 
}
