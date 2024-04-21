# Detyra2_SiguriaTeDhenave

==== Udhëzimet e hollësishme se si të ekzekutohet programi ====

1. Klonohet Repository nga Github
2. Tek file VigenereCipherEncryptTest.java dhe te VigenereCipherDecryptTest eshte implementimi i enkriptimit dhe dekripitimit(perkatesisht) duke perdorur Vigenere Cipher 
3. Tek file TurninGrilleCipherEncryptTest.java dhe te TurninGrilleCipherDecryptTest eshte implementimi i enkriptimit dhe dekripitimit(perkatesisht) duke perdorur Turnin Grille Cipher 

==== Një përshkrim i shkurtër por i plotë për secilën algoritëm që implementohet në program ====

Përshkrimi i Algoritmit të Vigenere Cipher Decrypt
 
  Per te dekriptuar tekstin e shifrur Vigener Cipher Fillimisht, tekstit dhe çelsin e shifruar kthehen ne shkronja te medha per te lehtesuar shkrimin.
Metoda decrypt(String message, String key) merr nje mesazh te shifruar dhe celesin si input dhe kthen tekstin e dekriptuar.
StringBuilder decryptedMessage = new StringBuilder(): Krijon nje objekt te klases StringBuilder per te mbajtur tekstin e dekriptuar.
message = message.toUpperCase() dhe key = key.toUpperCase(): Konverton tekstin dhe celesin ne shkronja te medha per te shmangur dallimin midis shkronjave te medha dhe te vogla gjate procesit te dekriptimit.
int keyLength = key.length(): Gjen gjatesine e celesit.
 Te for (int i = 0, j = 0; i < message.length(); i++): Fillon nje loop qe shkon permes cdo karakteri ne tekstin e shifruar, duke perdorur nje variabel "j" per te ndjekur poziten aktuale ne celesin.
char letter = message.charAt(i): Merr karakterin aktual ne poziten "i" te tekstit te shifruar.
if (Character.isLetter(letter)): Kontrollon nese karakteri aktual eshte nje shkronje.
Pastaj, per çdo karakter ne mesazhin e shifruar, perdorimi i çelesit per te kthyer karakterin ne tekstin origjinal duke perdorur formulen e Vigjener Cipher.
decryptedMessage.append((char)(((letter - 'A') - (key.charAt(j) - 'A') + 26) % 26 + 'A')): Kjo pjese e kodit ben dekriptimin e karakterit te dhene duke perdorur formulen e Vigjener Cipher. Kjo zbaton formulen: ((ciphertext - key + 26) % 26) + 'A', ku 'A' eshte ASCII vlera e shkronjes se pare ne alfabet. Ne kete rast, 'A' eshte 65 ne ASCII. Per te kthyer vlerat ne karaktere te shkronjave, shtohet 'A' ne fund.
j = ++j % keyLength: Perditeson poziten ne çeles per te perdorur shkronjen e ardhshme ne celesin.
else { decryptedMessage.append(letter); }: Nese karakteri aktual nuk eshte nje shkronje, atehere thjesht shtohet ne rezultatin e dekriptimit pa u ndryshuar.
return decryptedMessage.toString(): Kthen tekstin e dekriptuar si nje varg







==== Shembuj të rezultateve të ekzekutimit, ku përfshihet një shembull për secilën algoritëm që përdoret====