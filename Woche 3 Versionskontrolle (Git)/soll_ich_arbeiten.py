import random

def soll_ich_arbeiten():
    entscheidungen = [
        ("Ja, heute ist kein produktiver Tag!", "Wenn nicht, wird dein Kaffee morgen sehr stark sein!"),
        ("Nein, gönn dir eine Pause!", "Aber du wirst von dem Traum geplagt werden, in dem du versehentlich alle Emails löschst."),
        ("Vielleicht etwas leichte Arbeit heute.", "Sonst findest du morgen eine zusätzliche Besprechung in deinem Kalender."),
        ("Heute ist ein guter Tag, um etwas Neues zu lernen!", "Ignoriere es, und du wirst den ganzen Tag den Song 'Baby Shark' nicht loswerden."),
        ("Zeit für Kaffee, und dann entscheidest du.", "Kein Kaffee? Dann bereite dich auf den unendlichen Tee-Witz von deinen Kollegen vor.")
    ]
    entscheidung, konsequenz = random.choice(entscheidungen)
    print(f"Entscheidung: {entscheidung}\nKonsequenz: {konsequenz}")

if __name__ == "__main__":
    soll_ich_arbeiten()
