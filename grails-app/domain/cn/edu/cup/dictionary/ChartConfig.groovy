package cn.edu.cup.dictionary

class ChartConfig {

    DataKey dataKey
    ChartType chartType

    static constraints = {
    }

    String toString() {
        return "${chartType}.${dataKey}"
    }
}
