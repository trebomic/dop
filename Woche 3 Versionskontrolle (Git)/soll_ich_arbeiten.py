import random

def soll_ich_arbeiten():
    entscheidungen = [
        "Ja, heute ist ein produktiver Tag!",
        "Nein, gönn dir eine Pause!",
        "Vielleicht etwas leichte Arbeit heute.",
        "Heute ist ein guter Tag, um etwas Neues zu lernen!",
        "Zeit für Kaffee, und dann entscheidest du."
    ]
    entscheidung = random.choice(entscheidungen)
    print(entscheidung)

if __name__ == "__main__":
    soll_ich_arbeiten()