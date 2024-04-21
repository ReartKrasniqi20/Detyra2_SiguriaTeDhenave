== Shpjegimi i klases Main ==
Programi Java i dhënë Main kryen operacione enkriptimi dhe dekriptimi në një tekst të dhënë. Programi përdor klasën Scanner nga paketa java.util për të lexuar input nga përdoruesi. 
Pas ekzekutimit, përdoruesit i kërkohet të zgjedhë mes enkriptimit (1) dhe dekriptimit (2).
Pas zgjedhjes së një operacioni, përdoruesit i kërkohet të japë një tekst. Nëse gjatësia e tekstit të dhënë është më pak se 36 karaktere, programi shton karakteret 'x' në tekst derisa gjatësia e tij të arrijë 36 karaktere. 
Nëse gjatësia e tekstit të dhënë tejkalon 36 karaktere, programi e ndanë(prenë) tekstin në 36 karakteret e para dhe shfaq një mesazh që informon përdoruesin për prerjen.
Për enkriptim (d == 1), programi përdor një metodë nga klasa Encryption(Encryption.encrypt) për të enkriptuar tekstin e dhënë. Teksti i enkriptuar ruhet në një varg karakteresh 2D (char[][] out). 
Programi pastaj printon tekstin e enkriptuar në formatin e vargut të dyfishtë.
Për dekriptim (d == 2), programi përdor një metodë nga klasa Decryption(Decryption.dencrypt) për të dekriptuar tekstin e dhënë. Teksti i dekriptuar ruhet në një varg karakteresh 2D (char[][] out) dhe printohet në konsolë.

== Shpjegimi i klases Encryption ==
Klasa Encryption përdoret për të kryer enkriptimin e tekstit duke përdorur një algoritëm të njohur si "Fleissner Cipher Schablone". 
Metoda encrypt merr një tekst si input dhe kthen një matricë karakteresh 2D, e cila përmban tekstin e enkriptuar. 
Algoritmi fillimisht përdor një matricë fillestare të quajtur a1, ku disa karaktere janë zëvendësuar me 'X' për vendndodhjen e tekstit të enkriptuar. 
Teksti i dhënë ndahet në pjesë të vogla(substrings) dhe vendoset në matricën fillestare a1.
Pas kryerjes së këtij operacioni, matrica fillestare a1 rrotullohet përmes metodes rotate dhe procesi i enkriptimit përsëritet kundër tekstit të dhënë deri sa të gjithë karakteret të jenë përdorur për enkriptim.
Rezultati është një matricë karakteresh 2D me tekstin e enkriptuar.
Metoda rotate përdoret për të rrotulluar një matricë 6x6 me karaktere në drejtimin orar. 
Kjo është një pjesë e rëndësishme e algoritmit, pasi ndihmon në ndryshimin e vendndodhjes së karaktereve në çdo iteracion të procesit të enkriptimit.

== Shpjegim i klases Decryption ==
Kjo është klasa Decryption që përdoret për të dekriptuar tekstin e enkriptuar duke përdorur algoritmin e "Fleissner Cipher". 
Algoritmi i dekriptimit është një proces i kundërt i atij të enkriptimit, ku karakteret e tekstit të enkriptuar vendosen në një matricë të përcaktuar sipas një rregulli të "Cipher"-it për të zbuluar tekstin origjinal.
Metoda decrypt merr një tekst të enkriptuar si input dhe kthen një matricë karakteresh 2D me tekstin e dekriptuar. 
Karakteret e tekstit të enkriptuar vendosen në pozicionet e caktuara të matricës sipas një rregulli të caktuar për të kthyer tekstin e dekriptuar.
Ne kemi vendosur që në matricën fillestare, tek pozitat "x", të gjenden karakteret e plaintext-it. Duke e ditur këtë, mund të supozojmë se si të gjejmë karakteret për të dekriptuar tekstin. 
Duke rrotulluar matricën në drejtimin e njëjtë dhe duke ditur matricën fillestare, arrijmë tek një matricë 2D e cila ofron plaintext-in e enkriptuar përmes metodes encrypt.
Për shembull, karakteri në pozicionin e dytë të tekstit të enkriptuar do të vendoset në pozicionin e parë të matricës dekriptuese, karakteri në pozicionin e tretë do të vendoset në pozicionin e dytë të matricës, dhe kështu me radhë

== Shpjegimi i klases SubString ==
Ne klasen substring gjendet metoda substring për të ndarë tekstin hyrës në nënpjesë të vogla. 
Këto pjesë pastaj vendosen në "grill - matricen a1" (një strukturë e ngjashme me një rrjetë të përdorur në cipher) bazuar në pozicionet e shënuara nga vrimat(x qe kemi vendosur ne amtrice fillestare) në grillë.
Metoda substring merr tre parametra: stringun hyrës (str), indeksin fillestar (start), dhe indeksin mbarues (end). Ajo kthen një nënpjesë të stringut hyrës që fillon nga indeksi start dhe përfundon në indeksin end.
Ne Main: Permes kesaj metode kontrollon ne main gjatesine së hyres, nëse teksti hyrës ka më pak se 36 karaktere, ai plotësohet me karaktere 'x' derisa të arrijë një gjatësi prej 36.
Ne Encryption class: Në metodën Encryption.encrypt, teksti hyrës ndahet në nënstringe me gjatësi 9 duke përdorur metodën substring, Këto nënstringe pastaj enkriptohen duke përdorur algoritmin e Fleissner Cipher dhe karakteret e enkriptuar të rezultuar vendosen në një matricë 6x6 (out).
Ky proces përsëritet për çdo nënstring derisa të enkriptohet i gjithë teksti.
