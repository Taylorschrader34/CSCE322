module.exports = {
    onePlayerOneMove: onePlayerOneMove

}

var helpers = require('./helpers');

function onePlayerOneMove(game) {

    function whatever(move) {

        for (var i = 0; i < game.length; i++) {
            for (var j = 0; j < game[0].length; j++) {
                if (game[i][j] == '1') {

                    if (move == 'u' && i - 2 >= 0 && game[i - 1][j] != '-' && game[i - 2][j] == 'x') {
                        game[i][j] = 'x';
                        game[i - 1][j] = '-';
                        game[i - 2][j] = '1';
                        i = game.length + 5;
                        j = game[0].length + 5;
                    } else if (move == 'd' && i + 2 <= game.length - 1 && game[i + 1][j] != '-' && game[i + 2][j] == 'x') {
                        game[i][j] = 'x';
                        game[i + 1][j] = '-';
                        game[i + 2][j] = '1';
                        i = game.length + 5;
                        j = game[0].length + 5;
                    } else if (move == 'l' && j - 2 >= 0 && game[i][j - 1] != '-' && game[i][j - 2] == 'x') {
                        game[i][j] = 'x';
                        game[i][j - 1] = '-';
                        game[i][j - 2] = '1';
                        i = game.length + 5;
                        j = game[0].length + 5;
                    } else if (move == 'r' && j + 2 <= game[0].length - 1 && game[i][j + 1] != '-' && game[i][j + 2] == 'x') {
                        game[i][j] = 'x';
                        game[i][j + 1] = '-';
                        game[i][j + 2] = '1';
                        i = game.length + 5;
                        j = game[0].length + 5;
                    }
                }
            }
        }


        return game;
    }

    return whatever;
}
