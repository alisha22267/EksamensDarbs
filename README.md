# EksamensDarbs
Java programma ar JOptionPane, kas pārbauda zināšanas par ciklu ar skaitītāju(for cikls).

### Par progrāmmu:
Šī ir testēšanas programmā, kas veidota ar Java un izmanto JOptionPane grafiskos ievades/izvades logus.
Programma pārbauda lietotāja zināšanas par ciklu ar skaitītāju, izmantojot macību testu ar 10 jautājumiem.
- Šajā programmā pievienots mācību materiāls, kur jūs varat pamācīties un pēc tam mēģināt izpildīt testu!

**Darāmo darbu saraksts**
- [x] Izveidot jautājumu sarakstu (teksts, 4 atbildes, pareizās atbildes).
- [x] Nodrošināt nejaušu jautājumu secību.
- [x] Ļaut lietotājam ievadīt vairākus variantus (2 vai 3 pareizi).
- [x] Uzreiz pēc atbildes parādīt pareizību un piešķirt punktus:
    - +2 par pareizu atbildi
    - -1 par nepareizu atbildi
- [x] Parādīt gala rezultātu (ja punktu summa negatīva tad ir 0).
- [x] Paradīt logs ar rezultātam un parada jautājumus, uz kuriem atbildēts bija kļūda.
- [x] Nodrošināt, ka katram jautājumam var atbildēt tikai 1 reizi.

### Funkcijās:
- Atbildēs visas jārakstā ar atstarpēm (piemērām: 1 2 3)
- 10 jautājumi par for ciklu lietošanu Java valodā.
- Katram jautājumam ir 4 atbilžu varianti. 2 vai 3 no tiem ir pareizi.
- Atbildes tiek ievadītas, izmantojot JOptionPane.showInputDialog vai izvēlnes logus.
- Katrs jautājums tiek rādīts nejaušā secībā.
- Uzreiz pēc atbildes sniegšanas tiek parādīts novērtējums(pareizi/nepareizi).
- Punktu aprēķins:
  - Pareiza atbilde: +2 punkti
  - Nepareiza atbilde: -1 punkts
- Ja gala rezultāts ir negatīvs, tiek iestatīts uz 0 punktiem.
- Pēc visiem jautājumiem tiek parādīti:
  - Iegūto punktu skaits
  - Saraksts ar jautājumiem, uz kuriem atbildēts nepareizi.

### Attēli no programmas(kods)
- Es saglabāju visus jautājumus un atbildes masīvos.
![image](https://github.com/user-attachments/assets/8e5b0f58-2971-42fb-9525-435635ca07c0)


- Lai būtu ērtāk ar tiem strādāt, izveidoju vienu kopīgu masīvu, kur tiek glabāti visi jautājumi kopā ar visām to atbildēm.
- Tāpat izveidoju arī masīvu, kur tiek norādītas pareizās atbildes.
![image](https://github.com/user-attachments/assets/d8411c38-2399-4b40-81b9-c0dc66a3dd7b)


- Tālāk uztaisīju nejaušu jautājumu secību, izmantojot Collections.shuffle.
- Ir norādīts, kā tiek parādīti jautājumi.
- Ja lietotājs aizver logu (nospiež krustiņu) vai izvēlas "Cancel", programma tiek pārtraukta un par to tiek parādīts paziņojums.
![image](https://github.com/user-attachments/assets/4b53c503-d412-4121-8544-7d523a9463bc)


- Šeit notiek ievades pārbaude, lietotāja atbilde nevar būt mazāka par 1 vai lielāka par 4.
- Kad lietotājs ievada savu atbildi, programma noņem liekās atstarpes un sadala atbildes, jo pareizās atbildes var būt 2 vai 3.
- Pēc katra jautājuma tiek iztīrīts ar .clear(), lai netiktu sajauktas atbildes nākamajā solī.
![image](https://github.com/user-attachments/assets/b2c83f3b-553c-4689-9092-8d4fe2d1fd3e)

- Šeit tiek pārbaudīta atbilžu pareizība.
- Kad lietotājs ir ievadījis savu atbildi, viņam uzreiz tiek parādīts novērtējums (pareizi/nepareizi).
- Punktu skaits nekad nevar būt negatīvs.


![image](https://github.com/user-attachments/assets/4be192c3-2e95-40b7-8039-2c1e7ac7f3b2)


- Šeit tiek parādīts rezultātu logs ar kopējo punktu skaitu un jautājumu sarakstu, uz kuriem lietotājs atbildēja nepareizi.
![image](https://github.com/user-attachments/assets/563f3ce7-ddeb-4295-9387-d91a755ab070)

### Attēli no programmas:


- Tā izskatās jautājums ar atbilžu variantiem

  
![image](https://github.com/user-attachments/assets/f6aa7c71-7374-44d6-b122-cfa71233198a)



- Tā izskatās ievades logs, kur lietotājam jāievada savas atbildes (piemēram: 1 4)

  
![image](https://github.com/user-attachments/assets/09ae46f4-2a02-4597-bf46-d895ae0c8fc6)



- Tā izskatās paziņojums, ja atbilde IR pareiza:

  
![image](https://github.com/user-attachments/assets/79eb944a-b5eb-41da-b824-c7eef27e5d56)




- Tā izskatās paziņojums, ja atbilde NAV pareiza:

  
![image](https://github.com/user-attachments/assets/6981c3b7-3923-4edd-ab49-dc6907ff59df)




- Tā izskatās rezultātu logs ar iegūtajiem punktiem un jautājumiem, uz kuriem atbildēts kļūdaini:
![image](https://github.com/user-attachments/assets/4dd7156a-cb53-4ee2-8150-113a1ba3577f)

### Mācību materiāls
- Mācību materiālā jūs izpētīsiet for cikla veidus, piemēram, bezgalīgo ciklu, iekšējo un ārējo ciklu, kā arī dažādus piemērus.
- Šeit ir trīs piemēri ar kodu fragmentiem:

- Piemērs NR.1
  
![image](https://github.com/user-attachments/assets/d80ffe69-d739-4101-b2e9-4831cb812a97)

- Piemērs NR.2
  
![image](https://github.com/user-attachments/assets/a6e7709f-491a-4a97-ab03-23a3c3461bdd)

- Piemērs NR.3
  
![image](https://github.com/user-attachments/assets/f149cb3b-54cf-4162-b4d4-7eeab8204bc7)




 
