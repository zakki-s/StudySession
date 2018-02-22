package breeding;

/**
 * メインクラス
 *
 * @author ME
 *
 */
public class Main {
    public static void main(String[] arga) {

        // モンスターインスタンス生成
        Monster monster = new Monster();

        // 初期化
        monster.setName("なほみん");
        monster.setHp(250);

        // ステータス表示
        monster.showStatus();

        // 話す
        monster.talk();

        // 歩く
        monster.walk(2);

        // ステータス表示
        monster.showStatus();

        // 歩く
        monster.walk(10);

        // ステータス表示
        monster.showStatus();

        // 食べる
        String message = monster.eat("サラダ");
        System.out.println(message);

        // ステータス表示
        monster.showStatus();

        // 食べる
        String message2 = monster.eat("やきにく");
        System.out.println(message2);

        // ステータス表示
        monster.showStatus();

        // モンスターインスタンス生成２
        Monster nahomin = new Monster("nahomin", 2000);

        // 話す
        nahomin.talk();

        // ステータス表示
        nahomin.showStatus();
    }
}
