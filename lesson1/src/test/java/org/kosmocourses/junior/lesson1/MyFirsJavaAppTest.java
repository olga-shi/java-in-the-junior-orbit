package org.kosmocourses.junior.lesson1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyFirsJavaAppTest {
    private static final String asset1_1 = "Я - Робот, вступая в ряды 'отряда космонавтов'\n"
            + "Армии Java программистов, принимаю присягу и торжественно клянусь быть: \n"
            + "\t- честным со своими товарищами бойцами\n"
            + "\t- храбрым в борьбе с багами\n"
            + "\t- дисциплинированным в сроках закрытия задач\n"
            + "\t- строго хранить коммерческую тайну.\n"
            + "\n"
            + "Я клянусь добросовестно изучать IT, и всемерно беречь серверные мощности.\n"
            + "Я всегда готов использовать свой разум на решение поставленных задач.\n"
            + "Но несу моральную за код написанный мной.\n";

    @Test
    void runProgramLogicTest() {
        assertEquals(asset1_1, MyFirsJavaApp.runProgramLogic("Робот"), "Сообщение выводимое программой не совпадает с тем что указано в условиях задачи");
    }
}
