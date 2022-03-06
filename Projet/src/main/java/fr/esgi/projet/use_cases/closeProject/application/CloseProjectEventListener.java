package fr.esgi.projet.use_cases.closeProject.application;

import fr.esgi.projet.kernel.EventListener;

public class CloseProjectEventListener implements EventListener<CloseProjectEvent> {
    @Override
    public void listenTo(CloseProjectEvent event) {
        System.out.println("listening CloseProjectEvent.");
    }
}
