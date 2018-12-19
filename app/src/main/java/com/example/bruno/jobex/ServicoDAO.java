package com.example.bruno.jobex;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ServicoDAO extends SQLiteOpenHelper {

    private static final int VERSAO = 1;
    private static final String TABELA = "Servico";
    private static final String DATABASE = "DBJobex";

    private static final String TAG = "CADASTRA SERVICO";

    public ServicoDAO(Context context)
    {
        super(context, DATABASE, null, VERSAO);
    }

    public void onCreate(SQLiteDatabase database)
    {
        String ddl = "CREATE TABLE SERVICO(\n" +
                "\tID INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\tNOME TEXT,\n" +
                "\tDESCRICAO TEXT,\n" +
                "\tVLRREAIS REAL,\n" +
                "\tVLRMOEDA INTEGER,\n" +
                "\tTAGS TEXT\n" +
                "\t)";

        database.execSQL(ddl);
    }

    public void onUpgrade(SQLiteDatabase database, int versaoAntiga, int versaoNova)
    {

        String sql = "DROP TABLE IF EXISTS " + TABELA;

        database.execSQL(sql);

        onCreate(database);
    }

    public void cadastrar(ServicoModelo servico)
    {
        ContentValues values = new ContentValues();

        values.put("NOME", servico.getNome());
        values.put("DESCRICAO", servico.getDescricao());
        values.put("VLRREAIS", servico.getValorEmReais());
        values.put("VLRMOEDA", servico.getValorEmMoedaVirtual());
        values.put("TAGS", servico.getTags());

        getWritableDatabase().insert(TABELA, null, values);
    }

    public List<ServicoModelo> listar() {

        List<ServicoModelo> lista = new ArrayList<ServicoModelo>();

        String sql = "Select * from Servico order by nome";

        Cursor cursor = getReadableDatabase().rawQuery(sql, null);

        try {
            while (cursor.moveToNext())
            {
                ServicoModelo servico = new ServicoModelo();

                servico.setId(cursor.getLong(0));
                servico.setNome(cursor.getString(1));
                servico.setDescricao(cursor.getString(2));
                servico.setValorEmReais(cursor.getString(3));
                servico.setValorEmMoedaVirtual(cursor.getString(4));
                servico.setTags(cursor.getString(1));

                lista.add(servico);
            }
        } catch (SQLException e) {
            Log.e(TAG, e.getMessage());

        }
        finally {
            cursor.close();
        }

        return lista;

    }

    public void deletar(ServicoModelo servico)
    {
        String[] args = {servico.getId().toString()};

        getWritableDatabase().delete(TABELA, "id=?", args);
    }
}
