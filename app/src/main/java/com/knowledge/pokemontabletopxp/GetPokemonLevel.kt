package com.knowledge.pokemontabletopxp

object GetPokemonLevel {

    fun getLv(pokemonXp: Int) = when {
        pokemonXp <= 9 -> 1
        pokemonXp <= 19 -> 2
        pokemonXp <= 29 -> 3
        pokemonXp <= 39 -> 4
        pokemonXp <= 49 -> 5
        pokemonXp <= 59 -> 6
        pokemonXp <= 69 -> 7
        pokemonXp <= 79 -> 8
        pokemonXp <= 89 -> 9
        pokemonXp <= 109 -> 10
        pokemonXp <= 134 -> 11
        pokemonXp <= 159 -> 12
        pokemonXp <= 189 -> 13
        pokemonXp <= 219 -> 14
        pokemonXp <= 249 -> 15
        pokemonXp <= 284 -> 16
        pokemonXp <= 319 -> 17
        pokemonXp <= 359 -> 18
        pokemonXp <= 399 -> 19
        pokemonXp <= 459 -> 20
        pokemonXp <= 529 -> 21
        pokemonXp <= 599 -> 22
        pokemonXp <= 669 -> 23
        pokemonXp <= 744 -> 24
        pokemonXp <= 819 -> 25
        pokemonXp <= 899 -> 26
        pokemonXp <= 989 -> 27
        pokemonXp <= 1074 -> 28
        pokemonXp <= 1164 -> 29
        pokemonXp <= 1259 -> 30
        pokemonXp <= 1354 -> 31
        pokemonXp <= 1454 -> 32
        pokemonXp <= 1554 -> 33
        pokemonXp <= 1659 -> 34
        pokemonXp <= 1769 -> 35
        pokemonXp <= 1879 -> 36
        pokemonXp <= 1994 -> 37
        pokemonXp <= 2109 -> 38
        pokemonXp <= 2229 -> 39
        pokemonXp <= 2354 -> 40
        pokemonXp <= 2479 -> 41
        pokemonXp <= 2609 -> 42
        pokemonXp <= 2739 -> 43
        pokemonXp <= 2874 -> 44
        pokemonXp <= 3014 -> 45
        pokemonXp <= 3154 -> 46
        pokemonXp <= 3299 -> 47
        pokemonXp <= 3444 -> 48
        pokemonXp <= 3644 -> 49
        pokemonXp <= 3849 -> 50
        pokemonXp <= 4059 -> 51
        pokemonXp <= 4269 -> 52
        pokemonXp <= 4484 -> 53
        pokemonXp <= 4704 -> 54
        pokemonXp <= 4929 -> 55
        pokemonXp <= 5159 -> 56
        pokemonXp <= 5389 -> 57
        pokemonXp <= 5624 -> 58
        pokemonXp <= 5864 -> 59
        pokemonXp <= 6109 -> 60
        pokemonXp <= 6359 -> 61
        pokemonXp <= 6609 -> 62
        pokemonXp <= 6864 -> 63
        pokemonXp <= 7124 -> 64
        pokemonXp <= 7389 -> 65
        pokemonXp <= 7659 -> 66
        pokemonXp <= 7924 -> 67
        pokemonXp <= 8204 -> 68
        pokemonXp <= 8484 -> 69
        pokemonXp <= 8769 -> 70
        pokemonXp <= 9059 -> 71
        pokemonXp <= 9349 -> 72
        pokemonXp <= 9644 -> 73
        pokemonXp <= 9944 -> 74
        pokemonXp <= 10249 -> 75
        pokemonXp <= 10559 -> 76
        pokemonXp <= 10869 -> 77
        pokemonXp <= 11184 -> 78
        pokemonXp <= 11504 -> 79
        pokemonXp <= 11909 -> 80
        pokemonXp <= 12319 -> 81
        pokemonXp <= 12734 -> 82
        pokemonXp <= 13154 -> 83
        pokemonXp <= 13579 -> 84
        pokemonXp <= 14009 -> 85
        pokemonXp <= 14444 -> 86
        pokemonXp <= 14884 -> 87
        pokemonXp <= 15329 -> 88
        pokemonXp <= 15779 -> 89
        pokemonXp <= 16234 -> 90
        pokemonXp <= 16694 -> 91
        pokemonXp <= 17159 -> 92
        pokemonXp <= 17629 -> 93
        pokemonXp <= 18104 -> 94
        pokemonXp <= 18584 -> 95
        pokemonXp <= 19069 -> 96
        pokemonXp <= 19559 -> 97
        pokemonXp <= 20054 -> 98
        pokemonXp <= 20554 -> 99
        else -> 100
    }
}