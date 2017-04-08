package br.com.toolbox.app;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class CalendarioActivity extends AppCompatActivity {

    static  EditText edit_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edit_data = (EditText) findViewById(R.id.edit_data);
    }

    public void AbrirCalendario(View view) {
        // abrir calendario
        DialogFragment calendario = new DatePickerFragment();
                        // suporte fragment, string de indentificação do fragment
        calendario.show(getSupportFragmentManager(),"datepicker");
    }
    // fragment - fragmentos do codigo, pode usar o mesmo codigo em outros lugares...
    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            //criação do calendário
            // MOTIVO DE USAR ESSA FUNÇÃO: na criação do Dialog seta a data atual do sistema

            final Calendar c = Calendar.getInstance();
            int ano = c.get(Calendar.YEAR);
            int mes = c.get(Calendar.MONTH);
            int dia = c.get(Calendar.DAY_OF_MONTH);

            // cria uma nova instancia de calendario e retorna
            return new DatePickerDialog(getActivity(),this,ano,mes,dia);
        }

        @Override
        public void onDateSet(DatePicker view, int year, int month , int dayOfMonth) {

            //função execultada apos a escolha da data

            String dataSelecionada =String.format("%02d/%02d/%d", dayOfMonth,++month,year);

            edit_data.setText(dataSelecionada);




        }

    }
}
