# Tris

## 1. Panoramica del progetto
Questo progetto è un'applicazione Java realizzata con netbeans all'interno dell'IIS Galileo Galilei Crema. Questo programma simula il gioco di Tic Tac Toe (Tris). Per importare il progetto aprire netbeans, selezionare file -> importa progetto -> importa da zip -> seleziona de zip scaricato dal RELEASE -> premi importa.

## 2. Innanzitutto guarda il programma
la prima volta che si apre il programma verrà visualizzato il setup: la prima schermata chiederà di accettare i termini di servizio per proseguire e premere avanti (se si preme avanti senza accettare i termini il programma stamperà un messaggio di errore).
Subito dopo ti ritroverai davanti alla schermata dove dovrai inserire i tuoi dati personali tra cui:
- Nome di battesimo
- Cognome
- Nickname (utilizzato per il login)
- Password (utilizzata per il login)
- E-mail
<br>

Una volta inseriti i dati e premuto avanti ti verrà chiesto di verificare la tua email inserendo il codice che verrà inviato all'email indicata in fase di registrazione. Una volta verificata la tua email potrai scegliere il tema dell'app (chiaro, scuro o automatico) e infine verrai portato alla schermata di LogIN.

## 3. Accedi
Una volta completato il setup verrai portato alla pagina di login dove dovrai inserire i dati generati in fase di registrazione (nickname e password). Queste informazioni sono contenute nei due file generati durante la registrazione: nick.txt e pass.txt
Se i dati inseriti sono corretti verrai indirizzato alla dashboard, altrimenti apparirà un messaggio di errore e dovrai riprovare.
nella schermata di login è presente anche un pulsante per ricordare l'utente loggato, se si seleziona questo controllo dal secondo avvio del programma il login verrà effettuato automaticamente.

## 4. Dashboard e impostazioni
Questa schermata è quella principale dell'intero programma: permette di accedere alle 3 funzioni principali:
- Giocatore singolo
- Multigiocatore
- Impostazioni

una volta aperta la dashboard, la riproduzione della musica inizierà e non si interromperà quando si cambia schermata.

Premendo Giocatore singolo verrai portato direttamente alla partita. nella modalità singleplayer non è possibile scegliere l'icona da utilizzare (X o O), ma sarà comunque possibile utilizzare le skin sbloccate dalle impostazioni.
Premendo Multigiocatore verrai portato in una schermata in cui potrai scegliere i nomi dei giocatori (uno deve essere necessariamente il nome dell'account con cui hai effettuato l'accesso, mentre l'altro può essere scelto).
Utilizzando il pulsante delle impostazioni verrai portato in una schermata dove potrai vedere il nickname e i punti del tuo account (con i punti puoi sbloccare skin, i punti si guadagnano vincendo le partite: ogni partita vinta dà 10 punti.
troverai poi un pulsante per accedere al pannello di sblocco della skin (una pagina separata dalle impostazioni principali. In questa pagina troverai due sezioni: una dedicata all'icona X e una dedicata all'icona O. Potrai solo sblocca le skin se hai abbastanza punti (100 per sbloccare la prima e 200 per la seconda)
su entrambe le pagine delle impostazioni troverai un pulsante in alto a sinistra per tornare alla dashboard.

## 5. Giocatore singolo
la modalità singleplayer è una pagina in cui il giocatore può giocare senza bisogno di un compagno, giocando contro l'IA. Il computer nella versione V1.0.1 effettua solo scelte casuali. all'apertura della pagina la prima mossa sarà effettuata dal giocatore, seguita dal computer. lo stato della tabella verrà controllato non appena il cursore del mouse lascia i pulsanti. la parità terminerà non appena uno dei due giocatori raggiungerà i 5 punti.

## 6. Multigiocatore
la modalità multiplayer serve per affrontare una sfida due contro 2. Il giocatore iniziale è sempre X, ma questa volta è possibile scegliere i ruoli prima di iniziare la partita. anche qui potrete utilizzare skin precedentemente sbloccate. il gioco terminerà al raggiungimento dei 5 punti, assegnando in entrambi i casi 10 punti (i punti verranno accreditati sull'account con cui hai effettuato l'accesso).
