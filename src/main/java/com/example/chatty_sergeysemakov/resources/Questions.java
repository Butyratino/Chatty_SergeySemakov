package com.example.chatty_sergeysemakov.resources;

import java.util.List;

public class Questions {
    private String quest1 = "Can you tell me a joke?";
    private String quest2 = "Tell me a joke";
    private String quest3 = "Convert <amount> <from> to <to>";
    private String quest4 = "How much is <amount> <from> in <to>";

    public List<String> getAllQuestions() {
        return List.of(quest1, quest2, quest3, quest4);
    }
}
