==== Udhëzimet e hollësishme se si të ekzekutohet programi [TurningGrille-FleissnerCipher] ====

1. Shkarkimi dhe instalimi i IntelliJ IDEA.
2. Shkarkoni Repozitorin permes butonit 'code', opsionin si 'Zip-File'.
3. Ekstraktimi i skedarit te kodit nga skedari ZIP.
5. Hapja e projektit, selektimi i "Project root directory", konfigurimi i SDK.  
6. Ne klasen "Main" programi behet "run", dhe ekzekutohet, duke ofruar rezultatin e tij.
   
=== Nje pershkrim i shkruter dhe i sakte "TurningGrille-FleissnerCipher" ===
Turning Grille ose Fleissner Cipher eshte nje teknike e enkriptimit me transpozicion. Enkriptimi behet duke i vendosur shkronjat e plaintextit ne nje “grile” me dimensionet [n]x[n]. Shkronjat vendosen ne vende te
caktuara nga perdoruesi dhe per te enkriptuar te gjithe plaintextin duhet te rrotullojme grilen (ne kah te njejte me akrepat e ores ose ne kah te kundert me akrepat e ores) per 90 shkalle. Per te krijuar
ciphertextin duhet te merren shkronjat me rradhe nga fillimi i griles.
Dekriptimi behet ne menyre te ngjashme me enkriptimin. Vendet (hapsirat) e caktuara te griles dhe
kahu i rrotullimit do te duhen per te gjetur plaintextin. Grila do te rrotullohet 4 here ne kah te njejt me te cilin eshte enkriptuar.


==== Udhezimet e hollesishme se si te ekzekutohet programi [Vigenere Cipher] ====

1.	Shkarkimi dhe instalimi i Visual Studio Code dhe Java Extension Pack.
2.	Shkarkimi i kodit nga GitHub. Klikon ne butonin ‘Code’ ne GitHub dhe pastaj zgjedhet opsioni ZIP per te shkarkuar kodin ne kompjuter.    
3.	Ekstraktimi i skedarit te kodit nga skedari ZIP dhe vendosja e tij ne dosjen e Visual Studio Code. 
4.	Hapja e projektit ne Visual Studio Code.
5.	Ne fajllin VigenereCipherTest.java klikoni ne butonin ‘Run’ dhe programi i deshiruar ekzekutohet.

==== Nje pershkrim i shkurter dhe i sakte "Vigenere Cipher" ====
Vigenere Cipher eshte nje metode shume e vjeter dhe e sigurt per te koduar dhe dekoduar mesazhe. Kjo perdor nje tabele te quajtur tabela Vigenere, e cila eshte nje variant i nje tabele te njohur si tabele e Vigjenes. Tabela Vigenere eshte nje tabele e 26x26, ku kolonat dhe rreshtat perfaqesojne alfabetin nga A deri ne Z. Se pari zgjidhet nje celes (varg i fjaleve te ndryshme te shkronjave). Pastaj nevojitet mesazhi per tu koduar. Celesi perseritet aq shpesh sa eshte gjatesia e mesazhit. Per secilen shkronje te mesazhit, kryhet nje shkrim me shkronjen e perkatesise ne celes per te gjetur shkronjen e koduar. Perseritet ky proces per secilen shkronje ne mesazh. Mesazhi i koduar eshte rezultat i shkrimeve te bera ne celes. Dekodimi kryhet ne menyre te ngjashme, vetem ne kete rast, per te zbuluar mesazhin original, shkronjat e celesit zbriten nga ato te mesazhit te koduar!
