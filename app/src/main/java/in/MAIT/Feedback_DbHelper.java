package in.MAIT;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Feedback_DbHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME="Feedback";


    public static final String TABLE_Feedback="IFB";

    public static final String KEY_NAME="tname";
    public static final String KEY_EMAIL="temail";
    public static final String KEY_OPINION="topinion";
    public static final String KEY_RATING="trating";
    private static String CREATE_TABLE_Feedback = "CREATE TABLE "
            + TABLE_Feedback + " (" + KEY_NAME + " TEXT," + KEY_EMAIL + " TEXT," + KEY_OPINION + " TEXT, " + KEY_RATING + " TEXT)";


    public Feedback_DbHelper(Context context2) {
        super(context2, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db1) {
        db1.execSQL(CREATE_TABLE_Feedback);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db1, int oldVersion, int newVersion) {
        db1.execSQL("DROP TABLE IF EXISTS " + TABLE_Feedback);
        onCreate(db1);

    }
}
