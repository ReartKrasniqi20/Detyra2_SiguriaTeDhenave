== Shpjegimi i klases Main ==
Programi Java i dhene Main kryen operacione enkriptimi dhe dekriptimi ne nje tekst te dhene. Programi perdor klasen Scanner nga paketa java.util per te lexuar input nga perdoruesi. 
Pas ekzekutimit, perdoruesit i kerkohet te zgjedhe mes enkriptimit (1) dhe dekriptimit (2).
Pas zgjedhjes se nje operacioni, perdoruesit i kerkohet te jape nje tekst. Nese gjatesia e tekstit te dhene eshte me pak se 36 karaktere, programi shton karakteret 'x' ne tekst derisa gjatesia e tij te arrije 36 karaktere. 
Nese gjatesia e tekstit te dhene tejkalon 36 karaktere, programi e ndane(prene) tekstin ne 36 karakteret e para dhe shfaq nje mesazh qe informon perdoruesin per prerjen.
Per enkriptim (d == 1), programi perdor nje metode nga klasa Encryption(Encryption.encrypt) per te enkriptuar tekstin e dhene. Teksti i enkriptuar ruhet ne nje varg karakteresh 2D (char[][] out). 
Programi pastaj printon tekstin e enkriptuar ne formatin e vargut te dyfishte.
Per dekriptim (d == 2), programi perdor nje metode nga klasa Decryption(Decryption.dencrypt) per te dekriptuar tekstin e dhene. Teksti i dekriptuar ruhet ne nje varg karakteresh 2D (char[][] out) dhe printohet ne konsole.

== Shpjegimi i klases Encryption ==
Klasa Encryption perdoret per te kryer enkriptimin e tekstit duke perdorur nje algoritem te njohur si "Fleissner Cipher Schablone". 
Metoda encrypt merr nje tekst si input dhe kthen nje matrice karakteresh 2D, e cila permban tekstin e enkriptuar. 
Algoritmi fillimisht perdor nje matrice fillestare te quajtur a1, ku disa karaktere jane zevendesuar me 'X' per vendndodhjen e tekstit te enkriptuar. 
Teksti i dhene ndahet ne pjese te vogla(substrings) dhe vendoset ne matricen fillestare a1.
Pas kryerjes se ketij operacioni, matrica fillestare a1 rrotullohet permes metodes rotate dhe procesi i enkriptimit perseritet kunder tekstit te dhene deri sa te gjithe karakteret te jene perdorur per enkriptim.
Rezultati eshte nje matrice karakteresh 2D me tekstin e enkriptuar.
Metoda rotate perdoret per te rrotulluar nje matrice 6x6 me karaktere ne drejtimin orar. 
Kjo eshte nje pjese e rendesishme e algoritmit, pasi ndihmon ne ndryshimin e vendndodhjes se karaktereve ne çdo iteracion te procesit te enkriptimit.

== Shpjegim i klases Decryption ==
Kjo eshte klasa Decryption qe perdoret per te dekriptuar tekstin e enkriptuar duke perdorur algoritmin e "Fleissner Cipher". 
Algoritmi i dekriptimit eshte nje proces i kundert i atij te enkriptimit, ku karakteret e tekstit te enkriptuar vendosen ne nje matrice te percaktuar sipas nje rregulli te "Cipher"-it per te zbuluar tekstin origjinal.
Metoda decrypt merr nje tekst te enkriptuar si input dhe kthen nje matrice karakteresh 2D me tekstin e dekriptuar. 
Karakteret e tekstit te enkriptuar vendosen ne pozicionet e caktuara te matrices sipas nje rregulli te caktuar per te kthyer tekstin e dekriptuar.
Ne kemi vendosur qe ne matricen fillestare, tek pozitat "x", te gjenden karakteret e plaintext-it. Duke e ditur kete, mund te supozojme se si te gjejme karakteret per te dekriptuar tekstin. 
Duke rrotulluar matricen ne drejtimin e njejte dhe duke ditur matricen fillestare, arrijme tek nje matrice 2D e cila ofron plaintext-in e enkriptuar permes metodes encrypt.
Per shembull, karakteri ne pozicionin e dyte te tekstit te enkriptuar do te vendoset ne pozicionin e pare te matrices dekriptuese, karakteri ne pozicionin e trete do te vendoset ne pozicionin e dyte te matrices, dhe keshtu me radhe

== Shpjegimi i klases SubString ==
Ne klasen substring gjendet metoda substring per te ndare tekstin hyres ne nenpjese te vogla. 
Keto pjese pastaj vendosen ne "grill - matricen a1" (nje strukture e ngjashme me nje rrjete te perdorur ne cipher) bazuar ne pozicionet e shenuara nga vrimat(x qe kemi vendosur ne amtrice fillestare) ne grille.
Metoda substring merr tre parametra: stringun hyres (str), indeksin fillestar (start), dhe indeksin mbarues (end). Ajo kthen nje nenpjese te stringut hyres qe fillon nga indeksi start dhe perfundon ne indeksin end.
Ne Main: Permes kesaj metode kontrollon ne main gjatesine se hyres, nese teksti hyres ka me pak se 36 karaktere, ai plotesohet me karaktere 'x' derisa te arrije nje gjatesi prej 36.
Ne Encryption class: Ne metoden Encryption.encrypt, teksti hyres ndahet ne nenstringe me gjatesi 9 duke perdorur metoden substring, Keto nenstringe pastaj enkriptohen duke perdorur algoritmin e Fleissner Cipher dhe karakteret e enkriptuar te rezultuar vendosen ne nje matrice 6x6 (out).
Ky proces perseritet per çdo nenstring derisa te enkriptohet i gjithe teksti.

