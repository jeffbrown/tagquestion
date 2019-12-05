package demo

class CallerTagLib {

    def fancyText = { attrs ->
        out << myLib.fancy(attrs)
    }
}
