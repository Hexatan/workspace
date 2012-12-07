maj=raw_input('Voulez vous inserer des minuscule ou des majuscule(min/MAJ)')
if maj == "MAJ" :
    M = True
elif maj == "min" :
    M = False
else
    print "Ceci est une insulte en moldave"
text=raw_input('Inserez le texte a chiffrer\n')
n=input('Inserez le chiffre a decaler\n')
textenc=""
for lettre in text :
    if ord(lettre) == ord("z") and n > 0 :
        lettre_enc = chr(ord("a")+(n-1))
        textenc += lettre_enc
    elif ord(lettre) == ord("Z") and n > 0 : 
        lettre_enc = chr(ord("A")+(n-1))
        textenc += lettre_enc
    else :
        lettre_enc = chr(ord(lettre)+n)
        print lettre_enc
        if ord(lettre_enc) > ord("z") and M == False :
            lettre_enc = chr(ord(lettre_enc) - 26)
        elif ord(lettre_enc) < ord("a") and M == False :
            lettre_enc = chr(ord(lettre_enc) + 26)
        elif ord(lettre_enc) > ord("Z") and M == True :
            lettre_enc = chr(ord(lettre_enc) - 26)
        elif ord(lettre_enc) < ord("A") and M == True :
            lettre_enc = chr(ord(lettre_enc) + 26)
        textenc += lettre_enc
print textenc

