/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author Dudu
 */
public class Bishop extends ChessPiece {

    public Bishop(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString() {
        return "B";
    }

    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // nw
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        //ne
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }
        //se
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        //sw
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(position)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        return mat;
    }
}
