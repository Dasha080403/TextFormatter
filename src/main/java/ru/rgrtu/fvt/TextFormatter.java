package ru.rgrtu.fvt;

import ru.rgrtu.fvt.dto.TaskParameter;
import ru.rgrtu.fvt.enums.FormatVariables;
import ru.rgrtu.fvt.file_workers.ReaderText;
import ru.rgrtu.fvt.file_workers.WriterText;
import ru.rgrtu.fvt.users_interface.UsersCommander;

import java.nio.charset.StandardCharsets;

public class TextFormatter {
    public static void main(String[] args) {
        String text = getText();//получаем текст
        TaskParameter taskParameter = getTaskParameter();//получение параметров форматирования
        int variable = UsersCommander.getIntValue(">> Enter variable format text 1 or 2");//выбираем способ
        String resultText = FormatVariables.getByVariable(variable)//идёт определение варианта
                .startFormat(taskParameter, text);//форматирование текста
        new WriterText().writeText(resultText);//печать текста обратно
    }

    private static String getText() {
        String pathFile = UsersCommander.getStringValue(">> Please enter the path to the file with the text." +
                " File`s name must be in English: ");
        return new ReaderText(new String(pathFile.getBytes(StandardCharsets.UTF_8))).read().toString();//вычитываем файл
    }

    private static TaskParameter getTaskParameter() {
        int leftLine = UsersCommander.getIntValue(">> Enter left line number: ");//левая граница
        int rightLine = UsersCommander.getIntValue(">> Enter right line number: ");//правая граница
        int countSpaces = UsersCommander.getIntValue(">> Enter count space by paragraph: ");//пробелы перед абзацом
        return new TaskParameter(leftLine, rightLine, countSpaces);
    }
}
