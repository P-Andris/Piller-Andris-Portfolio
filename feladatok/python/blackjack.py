import random, time

print("\nBlack Jack")
print("----------")
print("Készítette: Piller András Gábor")
print("Ez egy egyszerűsített változat.")
print("Az eredeti játékszabályokért kattints ide: https://hu.wikipedia.org/wiki/Huszonegy")

kartyalapok = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

jatekosLap = 0
jatekosLapjai = []
jatekosOsszes = 0
osztoLap = 0
osztoLapjai = []
osztoOsszes = 0
jatekosKerLapot = True
osztoKerLapot = True
jatekVege = False

def kiiras():
    global jatekosLapjai, jatekosOsszes, osztoLapjai, osztoOsszes

    # print(f"\nAz osztó lapjai: {osztoLapjai}, összérték: {osztoOsszes}.")
    print(f"\nAz osztó első lapja: [{osztoLapjai[0]}], összérték: ???.")
    print(f"A játékos lapjai: {jatekosLapjai}, összérték: {jatekosOsszes}.")

def nyer():
    global jatekosOsszes, osztoOsszes, jatekosKerLapot, osztoKerLapot, jatekVege

    if((jatekosOsszes == 21 and osztoOsszes == 21) or (jatekosOsszes > 21 and osztoOsszes > 21) or ((jatekosOsszes == osztoOsszes) and (jatekosOsszes >= 17 and osztoOsszes >= 17))):
        print(f"\nAz osztó lapjai: {osztoLapjai}, összérték: {osztoOsszes}.")
        print(f"A játékos lapjai: {jatekosLapjai}, összérték: {jatekosOsszes}.")
        print("\nJÁTÉK VÉGE!")
        print("AZ EREDMÉNY: DÖNTETLEN!")
        jatekVege = True
    elif(jatekosOsszes == 21 or osztoOsszes > 21):
        print(f"\nAz osztó lapjai: {osztoLapjai}, összérték: {osztoOsszes}.")
        print(f"A játékos lapjai: {jatekosLapjai}, összérték: {jatekosOsszes}.")
        print("\nJÁTÉK VÉGE!")
        print("A GYŐZTES: A JÁTÉKOS!")
        jatekVege = True
    elif(osztoOsszes == 21 or jatekosOsszes > 21):
        print(f"\nAz osztó lapjai: {osztoLapjai}, összérték: {osztoOsszes}.")
        print(f"A játékos lapjai: {jatekosLapjai}, összérték: {jatekosOsszes}.")
        print("\nJÁTÉK VÉGE!")
        print("A GYŐZTES: AZ OSZTÓ!")
        jatekVege = True
    elif(jatekosKerLapot == False and osztoKerLapot == False):
        if(jatekosOsszes > osztoOsszes):
            print(f"\nAz osztó lapjai: {osztoLapjai}, összérték: {osztoOsszes}.")
            print(f"A játékos lapjai: {jatekosLapjai}, összérték: {jatekosOsszes}.")
            print("\nJÁTÉK VÉGE!")
            print("A GYŐZTES: A JÁTÉKOS!")
            jatekVege = True
        elif(jatekosOsszes < osztoOsszes):
            print(f"\nAz osztó lapjai: {osztoLapjai}, összérték: {osztoOsszes}.")
            print(f"A játékos lapjai: {jatekosLapjai}, összérték: {jatekosOsszes}.")
            print("\nJÁTÉK VÉGE!")
            print("A GYŐZTES: AZ OSZTÓ!")
            jatekVege = True

for i in range(2):
    jatekosLap = random.choice(kartyalapok)
    jatekosOsszes += jatekosLap
    jatekosLapjai.append(jatekosLap)
    osztoLap = random.choice(kartyalapok)
    osztoOsszes += osztoLap
    osztoLapjai.append(osztoLap)

while(True):
    kiiras()
    nyer()
    if(jatekVege):
        break
    if(jatekosOsszes < 17 and jatekosKerLapot):
        jatekosLap = random.choice(kartyalapok)
        jatekosOsszes += jatekosLap
        jatekosLapjai.append(jatekosLap)
    else: jatekosKerLapot = False
    if(osztoOsszes < 17 and osztoKerLapot):
        osztoLap = random.choice(kartyalapok)
        osztoOsszes += osztoLap
        osztoLapjai.append(osztoLap)
    else: osztoKerLapot = False

print("\nKöszönöm a játékot!")
time.sleep(1)
exit()