package com.knowledge.pokemontabletopxp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val totalBonusView = findViewById<TextView>(R.id.totalbonus)
        val commandList = resources.getStringArray(R.array.commandlevel)
        val spinner: Spinner = findViewById(R.id.spinner_id)
        val checkBoxView: CheckBox = findViewById(R.id.checkBox)
        var commandLevelSelected = 0
        var totalBonusValue = 0
        val pokemonXpView = findViewById<AppCompatEditText>(R.id.actualxp)
        val pokemonLevelView = findViewById<TextView>(R.id.pkmnValue)
        val trainingNumberView = findViewById<AppCompatEditText>(R.id.trainingnumber)
        val buttonCalcView = findViewById<AppCompatButton>(R.id.buttomcalc)
        val pkmnFinalXpView = findViewById<AppCompatTextView>(R.id.pkmnFinalXp)
        val pkmnFinalLvView = findViewById<AppCompatTextView>(R.id.pkmnFinalLv)
        var totalFinalXp: Int
        var training = 0
        var lvl = 0

      //  pokemonXpView.setTextColor(ContextCompat.getColor(this, R.color.purple_500))

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.commandlevel,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("Nothing")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long,
            ) {
                commandLevelSelected = commandList[position].toInt()
                totalBonusValue = getTotalBonus(commandLevelSelected, checkBoxView.isChecked)
                totalBonusView.text = totalBonusValue.toString()
            }

        }

        checkBoxView.setOnCheckedChangeListener { _, isChecked ->
            totalBonusValue = getTotalBonus(commandLevelSelected, isChecked)
            totalBonusView.text = totalBonusValue.toString()
        }

        pokemonXpView.doAfterTextChanged {
            val inputXp = it.toString()
            val valueInputXp = if (inputXp.isNotEmpty()) {
                inputXp.toInt()
            } else {
                0
            }
            lvl = GetPokemonLevel.getLv(valueInputXp)
            pokemonLevelView.text = lvl.toString()
            pkmnFinalXpView.text = valueInputXp.toString()
            pkmnFinalLvView.text = GetPokemonLevel.getLv(valueInputXp).toString()
        }

        trainingNumberView.doAfterTextChanged {
            training = if (it.toString().isNotEmpty()) {
                it.toString().toInt()
            } else {
                0
            }
        }

        buttonCalcView.setOnClickListener {
            try {
                totalFinalXp =
                    (getCalc(totalBonusValue, lvl, training) + pokemonXpView.text.toString().toInt())
                pkmnFinalXpView.text = totalFinalXp.toString()
                pkmnFinalLvView.text = GetPokemonLevel.getLv(totalFinalXp).toString()
            } catch (e: Exception) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }

        }

    }

    fun getTotalBonus(commandLevel: Int, isChecked: Boolean): Int {

        val bonus: Int = if (isChecked && commandLevel >= 5) 5 else 0

        return when {
            commandLevel <= 2 -> {
                bonus + 0
            }
            commandLevel <= 4 -> {
                bonus + 5
            }
            commandLevel <= 6 -> {
                bonus + 10
            }
            else -> {
                bonus + 15
            }
        }
    }

    private fun getCalc(getTotalBonus: Int, lvl: Int, training: Int): Int {

        return training * (lvl / 2 + getTotalBonus)

    }

}