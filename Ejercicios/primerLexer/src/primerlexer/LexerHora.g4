/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar LexerHora;

HORA : ([01][0-9]|'2'[0-3])':'[0-5][0-9]':'[0-5][0-9];
