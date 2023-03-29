package class_package.class_pets;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Parrot myParrot = new Parrot(2
                , 8,
                "dd",
                "d",
                "ss",
                "dd",
                -300000000
                );
        System.out.println(myParrot.lifetime());
        System.out.println(myParrot.getAge());
        myParrot.printAge();

        Map<String, pet> pets = new HashMap<>();
        pets.put("Asus", myParrot);

        String ss = "我は官軍我（わが）敵は　　\n" +
                "天地容れざる朝敵ぞ\n" +
                "敵の大將たる者は　\n" +
                "古今無雙（双）の英雄で\n" +
                " \n" +
                "之に從ふ兵（つわもの）は　　\n" +
                "共に慓悍（ひょうかん）決死の士\n" +
                "鬼神（きしん）に恥（はじ）ぬ勇あるも　\n" +
                "天の許さぬ叛逆を\n" +
                " \n" +
                "起しゝ者は昔より　\n" +
                "榮えし例（ためし）あらざるぞ\n" +
                "敵の亡ぶる夫迄（それまで）は　　\n" +
                "進めや進め諸共に\n" +
                " \n" +
                "玉ちる劔（つるぎ）拔き連れて　　\n" +
                "死ぬる覺悟で進むべし\n" +
                " \n" +
                "皇國（みくに）の風（ふう）と武士（もののふ）の　　\n" +
                "其身（そのみ）を護る靈（たましい）の\n" +
                "維新このかた廢（すた）れたる　\n" +
                "日本刀（やまとがたな）の今更に\n" +
                " \n" +
                "又（また）世に出づる身の譽（ほまれ）\n" +
                "敵も身方も諸共に\n" +
                "刄（やいば）の下に死ぬべきぞ　\n" +
                "大和魂ある者の\n" +
                " \n" +
                "死ぬべき時は今なるぞ　\n" +
                "人に後（おく）れて恥かくな\n" +
                "敵の亡ぶる夫迄（それまで）は　　\n" +
                "進めや進め諸共に\n" +
                " \n" +
                "玉ちる劔（つるぎ）拔き連れて　　\n" +
                "死ぬる覺悟で進むべし\n" +
                "https://lyricstranslate.com/ru/battotai-battotai.html";
        System.out.println(ss);

    }
}
