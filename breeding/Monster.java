package breeding;

/**
 * モンスタークラス
 *
 */
public class Monster {

    /** フィールド：名前 */
    String name;

    /** フィールド：HP */
    int hp;

    /** 定数：好きな食べ物 */
    private static final String FAVORITE_FOOD = "やきにく";

    /** 定数：HPが減っている */
    private static final int HP_DANGER = 50;

    /** 引数なしのコンストラクタ */
    Monster() {}

    /** 引数ありのコンストラクタ */
    Monster(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    /**
     * ステータスを表示するメソッド
     */
    void showStatus() {
        System.out.println("名前: " + getName() + " HP: " + getHp());
    }

    /**
     * 話すメソッド
     */
    void talk() {
        System.out.println("こんにちは！わたしの名前は、" + getName() + "だよ！");
    }

    /**
     * 歩くメソッド
     *
     * @param time   歩く分数
     */
    void walk(int time) {
        System.out.println(time + "分さんぽしたよ");

        this.hp = this.hp - (time * 20);

        if (this.hp <= HP_DANGER) {
            System.out.println("お腹すいたな、、");
        }
    }

    /**
     * 食べるメソッド
     *
     * @param food  食べ物
     * @return お礼の言葉
     */
    String eat(String food) {

        if (FAVORITE_FOOD.equals(food)) {
            this.hp += 100;
            return "おおおぉぉ!!!!! やきにく!!!!! ありがとう!!!!!";
        }

        this.hp += 10;
        return "おぉ, " + food + "をくれるの？ ありがとう!";
    }

    /**
     * 名前を取得
     *
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 名前を設定
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * HPを取得
     *
     * @return HP
     */
    public int getHp() {
        return hp;
    }

    /**
     * HPを設定
     *
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

}
