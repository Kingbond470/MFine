package com.example.mfineapplication

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_coin.*

class CoinFragment : Fragment(R.layout.fragment_coin) {
    private var isAnswerOneShowing = false
    private var isAnswerTwoShowing=false
    private var isAnswerThreeShowing=false
    private var isAnswerFourShowing=false
    private var isAnswerFiveShowing=false
    private var isAnswerSixSowing=false
    private var isAnswerSevenShowing=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /**
        => Question & Answer on CLik operation calling
         */
        q_no1.setOnClickListener {
            onClickQuestion1()
        }
        q_no2.setOnClickListener {
            onClickQuestion2()
        }
        q_no3.setOnClickListener {
            onClickQuestion3()
        }
        q_no4.setOnClickListener {
            onClickQuestion4()
        }
        q_no5.setOnClickListener {
            onClickQuestion5()
        }
        q_no6.setOnClickListener {
            onClickQuestion6()
        }
        q_no7.setOnClickListener {
            onClickQuestion7()
        }
    }

    /**
    => Question & Answer on CLik operation implementing
     */
    private fun onClickQuestion1() {
        if (!isAnswerOneShowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no1.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no1.visibility = View.VISIBLE
            isAnswerOneShowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no1.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no1.visibility = View.GONE
            isAnswerOneShowing = false
        }

    }


    private fun onClickQuestion2() {
        if (!isAnswerTwoShowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no2.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no2.visibility = View.VISIBLE
            isAnswerTwoShowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no2.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no2.visibility = View.GONE
            isAnswerTwoShowing = false
        }
    }

    private fun onClickQuestion3() {
        if (!isAnswerThreeShowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no3.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no3.visibility = View.VISIBLE
            isAnswerThreeShowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no3.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no3.visibility = View.GONE
            isAnswerThreeShowing = false
        }
    }

    private fun onClickQuestion4() {
        if (!isAnswerFourShowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no4.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no4.visibility = View.VISIBLE
            isAnswerFourShowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no4.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no4.visibility = View.GONE
            isAnswerFourShowing = false

        }
    }

    private fun onClickQuestion5() {
        if (!isAnswerFiveShowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no5.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no5.visibility = View.VISIBLE
            isAnswerFiveShowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no5.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no5.visibility = View.GONE
            isAnswerFiveShowing = false
        }
    }

    private fun onClickQuestion6() {
        if (!isAnswerSixSowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no6.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no6.visibility = View.VISIBLE
            isAnswerSixSowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no6.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no6.visibility = View.GONE
            isAnswerSixSowing = false
        }
    }

    private fun onClickQuestion7() {
        if (!isAnswerSevenShowing) {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_up_icon)
            q_no7.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no7.visibility = View.VISIBLE
            isAnswerSevenShowing = true
        } else {
            val icon = ContextCompat.getDrawable(requireContext(), R.drawable.arrow_down_icon)
            q_no7.setCompoundDrawablesWithIntrinsicBounds(null, null, icon, null)
            ans_no7.visibility = View.GONE
            isAnswerSevenShowing = false
        }
    }
}