package com.fisa.group.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.fisa.group.test.interfaces.Interface_Notas.*;
import static com.fisa.group.test.stepdefinitions.ParameterDefinitionsStatics.sNotas;

public class Task_Notas implements Task {

    String repeticion;
    public Task_Notas(String notas, String repeticion) {
        sNotas = notas.replace(" ", "").split(",");
        this.repeticion = repeticion;
    }

    public static Task_Notas task_Notas(String notas, String repeticion) {
        return Tasks.instrumented(Task_Notas.class, notas, repeticion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        tocar(actor, Integer.parseInt(repeticion));
    }

    private void tocar(Actor actor, int repeticion){
        for (int i = 0; i < repeticion; i++) {
            for (String nota : sNotas) {
                switch (nota) {
                    case "do": actor.attemptsTo(Click.on(do_2da8va)); break;
                    case "re": actor.attemptsTo(Click.on(re_2da8va)); break;
                    case "sol": actor.attemptsTo(Click.on(sol_1ra8va)); break;
                    case "la": actor.attemptsTo(Click.on(la_1ra8va)); break;
                    case "si": actor.attemptsTo(Click.on(si_3ra8va)); break;
                    case "fa": actor.attemptsTo(Click.on(fa_1ra8va)); break;
                }
            }
        }
    }
}