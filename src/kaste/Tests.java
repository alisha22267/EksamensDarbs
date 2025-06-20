package kaste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tests {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		ArrayList<Integer> jautRandom = new ArrayList<>();
		ArrayList<Integer> nepareizi = new ArrayList<>();
		ArrayList<Integer> lietAtb = new ArrayList<>();
		ArrayList<Integer> pareizas = new ArrayList<>();
		int punkti = 0;
		String ievade;
		int sk = 0;
		int sk1 = 0;
		
		String[] jaut1 = {"Kas raksturīgs for ciklam Java?"};
		String[] atb1 = {"To lieto, ja zināms atkārtojumu skaits", 
		"Tajā jāizmanto boolean tips mainīgajiem",
		"To var izmantot masīvu iterēšanai",
		"To nedrīkst ligzdot jeb izmantot iekš cita cikla"};//0, 2
		
		String[] jaut2 = {"Kuras no šīm ir for cikla daļas?"};
		String[] atb2 = {"Inicializācija", "Cikla nosacījums",
		"Iterācijas izteiksme", "Cikla nosaukums"};//0, 1, 2
		
		String[] jaut3 = {"Kas izraisa for cikla pārtraukšanu?"};
		String[] atb3 = {"break", "continue", "return", "Nepatiesa nosacījuma vērtība"};//0, 2, 3
		
		String[] jaut4 = {"Kāda ir for cikla galvenā priekšrocība?"};
		String[] atb4 = {"Kontrolē atkārtojumus", "Tik viena rindiņa ciklā",
		"Mainīt skaitītāju", "Tik viena iterācija"}; //0, 2
		
		String[] jaut5 = {"Ko nozīmē for (int i=0; i<10; i+=2)?"};
		String[] atb5 = {"Palielina i par 1", "Nekad nebeidzas", 
		"Kamēr i < 10", "Palielina i par 2"}; //2, 3
		
		String[] jaut6 = {"Kurš ir pareizs skaitītāja tips for ciklā?"};
		String[] atb6 = {"String", "int", "char", "boolean"}; //1, 2
		
		String[] jaut7 = {"Ko dara continue for ciklā?"};
		String[] atb7 = {"Pāriet uz nākamo iterāciju", "Darbojas tikai for ciklā",
		"Pārtrauc visu ciklu", "Izlaiž atlikušās darbības šajā iterācijā"}; //0, 1, 3
		
		String[] jaut8 = {"Kādi ir pareizie for cikla varianti?"};
		String[] atb8 = {"for int i=0 to 10", "for(i=0; i<10; i++)",
		"for(int i=10; i>0; i--)", "for(int i=0; i<10; i++)"}; //1, 2, 3
		
		String[] jaut9 = {"Kurās situācijās for cikls ir noderīgs?"};
		String[] atb9 = {"Iterējot caur masīvu", "Veicot fiksētu darbību skaitu",
		"Lai mainītu datu tipu", "Bezgalīgam fona ciklam ar break"}; //0, 1, 3
		
		String[] jaut10 = {"Kāds ir for cikla lietojums masīvos"};
		String[] atb10 = {"Lai iterētu katru elementu", "Lai inicializētu mainīgo",
		"Lai noteiktu datu tipu", "Lai piekļūtu elementiem pēc indeksa"}; //0, 3
		
		String[][] jaut = {jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9, jaut10};
		String[][] atb = {atb1, atb2, atb3, atb4, atb5, atb6, atb7, atb8, atb9, atb10};
		int[][] pareiziAtb = {{0, 2}, {0, 1, 2}, {0, 2, 3}, {0, 2}, {2, 3},
		{1, 2}, {0, 1, 3}, {1, 2, 3}, {0, 1, 3}, {0, 3}};
		
		for(int i=0; i<10; i++) {
			jautRandom.add(i);
		}
		
		Collections.shuffle(jautRandom);
		for(int j=0; j<jautRandom.size(); j++) {
			sk = jautRandom.get(j);
			
			String jautSk = jaut[sk][0]+"\n"; 
			
			jautSk += "1. " + atb[sk][0]+ "\n";
			jautSk += "2. " + atb[sk][1]+ "\n";
			jautSk += "3. " + atb[sk][2]+ "\n";
			jautSk += "4. " + atb[sk][3]+ "\n";
			
			ievade = JOptionPane.showInputDialog(jautSk);
			
			if(ievade == null) {
				JOptionPane.showMessageDialog(null, "Tests ir partraukts!",
				"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			lietAtb.clear();
			ievade = ievade.trim();//nonem liekas atstarpes sakum un beigas 
			String[] ievade1 = ievade.split("\\s+");//sadala tekstu pēc vienas vai vairākām atstarpēm secībā
			
			for(int i=0; i<ievade1.length; i++) {
				try {
					sk1 = Integer.parseInt(ievade1[i])-1;
					if(sk1 >= 0 && sk1 <4) {
						lietAtb.add(sk1);
					}
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Skaitļi nav pareizi ievaditi!",
					"Kļūda", JOptionPane.ERROR_MESSAGE);
				}
			}
			
				pareizas.clear();//lai iepriekšie rezultati nesajuakt ar nākamiem
			    for (int i = 0; i < pareiziAtb[sk].length; i++) {
			        pareizas.add(pareiziAtb[sk][i]);
			    }
				
			    //collections ir šeit, lai ne sajaukt secību atbildēm
			    Collections.sort(lietAtb);
			    Collections.sort(pareizas);
			    
				if(lietAtb.equals(pareizas)) {
					JOptionPane.showMessageDialog(null, 
					"Atbildē IR pareizā. Jūs saņēmat +2 punktu!", "Paziņojums",
					JOptionPane.INFORMATION_MESSAGE);
					punkti += 2;
					pareizas.add(sk);
					
				} else {
					JOptionPane.showMessageDialog(null, 
					"Atbildē NAV pareizā. Jūs saņēmat -1 punktu!", "Paziņojums",
					JOptionPane.ERROR_MESSAGE);
					punkti -= 1;
					nepareizi.add(sk);
				}
				
				if(punkti < 0) {
					punkti = 0;
				}
		}
		String beigas = "Jūs pabeidzāt testu!\n"
		+ "Kopējie iegūtie punkti: " + punkti + "\n";

		if (!nepareizi.isEmpty()) {
			beigas += "\nJautājumi, uz kuriem atbildēts nepareizi:\n";
			for (int i = 0; i < nepareizi.size(); i++) {
				int x = nepareizi.get(i);
				beigas += "- " + jaut[x][0] + "\n";
			}
		} else {
			beigas += "\nVisas atbildes ir pareizas!";
		}

		JOptionPane.showMessageDialog(null, beigas,
		"Rezultāts", JOptionPane.INFORMATION_MESSAGE);
	}
}
