package kaste;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] jaut1 = {"Kas raksturīgs for ciklam Java?"};
		String[] atb1 = {
		"To lieto, ja zināms atkārtojumu skaits", "Tajā jāizmanto boolean tips mainīgajiem",
		"To var izmantot masīvu iterēšanai",
		"To nedrīkst ligzdot jeb izmantot iekš cita cikla"};//0, 2
		
		String[] jaut2 = {"Kuras no šīm ir for cikla daļas?"};
		String[] atb2 = {"Inicializācija", "Cikla nosacījums",
		"Iterācijas izteiksme", "Cikla nosaukums"};//0, 1, 2
		
		String[] jaut3 = {"Kas izraisa cikla pārtraukšanu?"};
		String[] atb3 = {"break", "continue", "return", "Nepatiesa nosacījuma vērtība"};//0, 2, 3
		
		String[] jaut4 = {"Kāda ir for cikla galvenā priekšrocība?"};
		String[] atb4 = {"Kontrolē atkārtojumus", "Tik viena rindiņa ciklā",
		"Mainīt skaitītāju", "Tik viena iterācija"}; //0, 2
		
		String[] jaut5 = {"Ko nozīmē for (int i=0; i<10; i+=2)?"};
		String[] atb5 = {"Palielina i par 1", "Nekad nebeidzas", 
		"Kamēr i < 10", "Palielina i par 2"}; //2, 3
		
		String[] jaut6 = {"Kurš ir pareizs skaitītāja tips?"};
		String[] atb6 = {"String", "int", "char", "boolean"}; //1, 2
		
		String[] jaut7 = {"Ko dara continue ciklā?"};
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

	}

}
