# YAHTZEE!

Write functions that simulate the game of yahtzee

1. Create a function to simulate a die roll (using rand or Math.random)

```javascript
rollDie(); // 1|2|3|4|5|6
```

```clojure
(roll-die) ; 1|2|3|4|5|6
```

2. Create a function that rolls 5 dice like as in yahtzee

```javascript
rollDice(); // [1, 4, 4, 5, 6]
```

```clojure
(roll-dice) ; (1, 6, 6, 5, 4)
```

3. Create a function that rolls until it gets yahtzee and counts the number of attempts (bonus points if you make your computer say yahtzee with the `say` command)

```javascript
getYahtzee(); // Got Yahtzee in 1987 attempts
```

```clojure
(get-yahtzee) ; Got Yahtzee in 3298 attempts
```

4. Create a function that finds the highest score in an attempt. Rules: [here](https://en.wikipedia.org/wiki/Yahtzee#Rules)

```javascript
const roll = rollDice(); // [1, 1, 1, 3, 4]
getScore(roll); // { category: 'Three of a kind', score: 10 }
```

```clojure
(def roll (roll-dice)) ; (6, 6, 6, 6, 6)
(get-score roll) ; { :category "Yahtzee!" :score 50 }
```

5. Create the ability to play yahtzee in the command line

Either using the clojure [read-line](http://clojuredocs.org/clojure.core/read-line) or the node [readline](https://nodejs.org/api/readline.html)
