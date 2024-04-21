# Detyra2_SiguriaTeDhenave

==== Pershkrimi i secilit algoritem qe perdoret ne program ====


Algoritmi ne file VigenereCipherEncrypt.java 


Ne file VigenereCipherEcrypt se pari kemi nje klase publike qe quhet VigenereCipherEncrypt dhe nje metode statike me emrin encrypt qe merr dy stringje si parametra: ‘message’ mesazhi qe deshirojme me enkriptu dhe ‘key’ celesi per me perdor ne enkriptim.
Vazhdojme me inicializimin e nje objekti ‘StringBuilder’ per te ruajtur mesazhin e enkriptuar.
I transformojme te gjitha karakteret e mesazhit dhe celesit ne shkronja te medha duke perdorur ‘.toUpperCase()’ per te qene me te sigurt per enkriptimin. 
Para se te nisim nje loop per te shkuar te secili karakter i mesazhit, e llogarisim gjatesine e celesit.
Brenda loop-it me ‘Character.isLetter(letter)’ kontrollojme nese karakteri aktual ne rradhe eshte nje shkronje.
-	Nese karakteri eshte nje shkronje, llogarisim vleren e re te karakterit te enkriptuar duke perdorur formulen e Vigenere Cipher:
Shkarkojme vleren ASCII te shkronjes se mesazhit dhe celesit, pastaj e zbatojme formulen per te gjetur shkronjen e enkriptuar duke perdorur '((letter – 'A') + (key.charAt(j) – 'A')) % 26 + 'A' ';

Po e shpjegoj hap pas hapi formulen '(letter – 'A') + (key.charAt(j) – 'A') % 26 + 'A' me nje shembull te thjeshte. Nese e marr mesazhin ‘HELLO’ dhe celesin 'KEY' formula funksionon keshtu:
-	Shkronja e pare e mesazhit eshte 'H' dhe shkronja e pare e celesit eshte 'K';
-	Gjatesia e shkronjave ne alfabet nga 'H' ne 'K' eshte 3 (H>I>J>K);
-	Shkronja 'H' ne ASCII ka vleren 72;
-	Shkronja 'K' ne ASCII ka vleren 75;
-	Pasi qe 'A' ne ASCII ka vleren 65 kemi (72-65)=7 dhe (75-65)=10;
-	Keshtu (7-65)+(10-65)=7+10=17 – distancen e tyre ne ASCII;
-	17%26 eshte 17, pasi qe 17 eshte me i  vogel se 26;
-	Perfundimisht, shkronja e enkriptuar per ‘H’ duke perdorur celesin ‘K’ eshte shkronja ne poziten 17 ne alfabet e qe eshte ‘R’;
-	Keshtu, shkronja 'H' enkriptohet ne 'R' duke perdorur celesin 'K'. Kjo logjike aplikohet per te gjitha shkronjat e tjera ne mesazh duke e zhvendosur celesin deri kemi arritur ne fund te tij;
Pastaj vleren e gjetur e shtojme tek shkronja e re ne ‘encryptedMessage’;
Perdorim ‘j = ++j % keyLength’ per te zhvendosur pozicionin e indeksit te celesit ne rast se celesi ka me shume karaktere se mesazhi. Ky veprim zbatohet duke e rritur indeksin e celesit per te perdorur karakterin tjeter te celesit ne heren e radhes. 

-	Nese karakteri nuk eshte nje shkronje(pershembull, nje hapesire ose nje karakter special), thjesht e shtojme ate ne ‘encryptedMessage’.
Perfundimisht e kthejme ‘encryptedMessage’ sin je string duke perdorur ‘toString()’.




Algoritmi ne file VigenereCipherDecrypt.java 



Per te dekriptuar tekstin e shifrur Vigenere Cipher fillimisht, tekstin dhe celsin e shifruar kthehen ne shkronja te
medha per te lehtesuar shkrimin.

Metoda decrypt(String message, String key) merr nje mesazh te shifruar dhe celesin si input dhe kthen tekstin e dekriptuar.
StringBuilder decryptedMessage = new StringBuilder(): Krijon nje objekt te klases StringBuilder per te mbajtur tekstin e dekriptuar.

message = message.toUpperCase() dhe key = key.toUpperCase(): Konverton tekstin dhe celesin ne shkronja te medha per te shmangur dallimin midis shkronjave te medha dhe te vogla gjate procesit te dekriptimit.
int keyLength = key.length(): Gjen gjatesine e celesit.

Te for (int i = 0, j = 0; i < message.length(); i++): Fillon nje loop qe shkon permes cdo karakteri ne tekstin e shifruar, duke perdorur nje variabel "j" per te ndjekur poziten aktuale ne celesin.

char letter = message.charAt(i): Merr karakterin aktual ne poziten "i" te tekstit te shifruar.
if (Character.isLetter(letter)): Kontrollon nese karakteri aktual eshte nje shkronje.
Pastaj, per çdo karakter ne mesazhin e shifruar, perdorimi i çelesit per te kthyer karakterin ne tekstin origjinal duke perdorur formulen e Vigjener Cipher.
decryptedMessage.append((char)(((letter - 'A') - (key.charAt(j) - 'A') + 26) % 26 + 'A')): Kjo pjese e kodit ben dekriptimin e karakterit te dhene duke perdorur formulen e Vigjener Cipher. Kjo zbaton formulen: ((ciphertext - key + 26) % 26) + 'A', ku 'A' eshte ASCII vlera e shkronjes se pare ne alfabet. Ne kete rast, 'A' eshte 65 ne ASCII.                    Per te kthyer vlerat ne karaktere te shkronjave, shtohet 'A' ne fund.
j = ++j % keyLength: Perditeson poziten ne çeles per te perdorur shkronjen e ardhshme ne celesin.
else { decryptedMessage.append(letter); }: Nese karakteri aktual nuk eshte nje shkronje, atehere thjesht shtohet ne rezultatin e dekriptimit pa u ndryshuar.
return decryptedMessage.toString(): Kthen tekstin e dekriptuar si nje varg.



Algoritmi ne file VigenereCipherTest.java

Ky algoritem printon mesazhin ne terminal me ndihme te metodes ‘main’ dhe tregon qe po fillon procesi i enkriptimit apo dekriptimit me VigenereCipher.
Perdoruesi i programit pyetet per inputin, ne menyre qe programi te dije a me enkriptu apo dekriptu. Perdoruesi mund te zgjedh numrin 1 per me enkriptu apo numrin 2 per me dekriptu. 
Pas zgjedhjes se perdoruesit, program vazhdon.
Nese perdoruesi ka zgjedh numrin 1(enkriptimin) atij i kerkohet celesi me shkronja te medha dhe pastaj mesazhi qe deshiron me enkriptu. Pas marrjes se inputit programi e thirr metoden ‘encrypt’ te klases ‘VigenereCipherEncrypt’ per me enkriptu mesazhin me celesin e dhene. Ne fund rezultati i enkriptimin shfaqet ne terminal.
E nese perdoruesi zgjedh 2(dekriptimin), procesi eshte krejtesisht i ngjashem si me lart. Por ne vend qe te thirret metoda ‘encrypt’, thirret metoda ‘decrypt’ e klases ‘VigenereCipherDecrypt’. Rezultati i dekriptimit shfaqet ne terminal.
Nese perdoruesi jep zgjidhje qe nuk eshte as 1 as 2, atehere ne ekran shfaqet mesazhi “Input i gabuar”.
Ne fund objekti ‘Scanner’ mbyllet per te liruar hapesiren ne kujtesen e kompjuterit.
