package com.christiandevenish.gui;

import com.christiandevenish.Move;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

public class GameHistoryTable extends JScrollPane {

    private final DataModel dataModel;
    private final JTable table;
    private final JScrollPane scrollPane;

    public GameHistoryTable(int width, int height) {
        dataModel = new DataModel();
        table = new JTable(dataModel);
        table.setRowHeight(15);
        scrollPane = new JScrollPane(table);
        scrollPane.setColumnHeaderView(table.getTableHeader());
        scrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(width, height));
    }

    /*
    public void redo(Board board, MoveLog moveLog) {
        int currentRow = 0;
        this.dataModel.clear();
        for (Move move : moveLog.getMoves()) {
            String moveText = move.toString();
            if (move.getMovedPiece().getPieceColor() == PlayerColor.WHITE) {
                this.dataModel.setValueAt(moveText, currentRow, 0);
            } else if (move.getMovedPiece().getPieceColor() == PlayerColor.BLACK) {
                this.dataModel.setValueAt(moveText, currentRow, 0);
                currentRow++;
            }
        }

        if (moveLog.getMoves().size() > 0) {
            Move lastMove = moveLog.getMoves().get(moveLog.getMoves().size() - 1);
            String moveText = lastMove.toString();

            if (lastMove.getMovedPiece().getPieceColor() == PlayerColor.WHITE) {
                this.dataModel.setValueAt(moveText + calculateCheckAndCheckMateHash(), currentRow - 1, 1);
            }
        }

        JScrollBar vertical = scrollPane.getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }
     */

    /*
    private String calculateCheckAndCheckMateHash(Game game) {
        if (game.currentPlayer().isInCheckmate()) {
            return "#";
        } else if (game.currentPlayer().isInCheck()) {
            return "+";
        }
        return "";
    }
    */

    public JScrollPane getScrollPane() {
        return this.scrollPane;
    }

    private class DataModel extends DefaultTableModel {
        private final List<Row> values;
        private final String[] NAMES = {"White","Black"};

        protected DataModel() {
            this.values = new ArrayList<>();
        }

        public void clear() {
            this.values.clear();
            setRowCount(0);
        }

        @Override
        public int getRowCount() {
            if (this.values == null) {
                return 0;
            }
            return this.values.size();
        }

        @Override
        public int getColumnCount() {
            return NAMES.length;
        }

        @Override
        public Object getValueAt(int row, int column) {
            Row currentRow = this.values.get(row);
            if (column == 0) {
                return currentRow.getWhiteMove();
            } else if (column == 1) {
                return currentRow.getBlackMove();
            }
            return null;
        }

        @Override
        public void setValueAt(Object aValue, int row, int column) {
            Row currentRow;
            if (this.values.size() <= row) {
                currentRow = new Row();
                this.values.add(currentRow);
            } else {
                currentRow = this.values.get(row);
            }
            if (column == 0) {
                currentRow.setWhiteMove((String) aValue);
            } else if (column == 1) {
                currentRow.setBlackMove((String) aValue);
                fireTableCellUpdated(row, column);
            }
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return Move.class;
        }

        @Override
        public String getColumnName(int column) {
            return NAMES[column];
        }
    }

    private class Row {
        private String whiteMove;
        private String blackMove;

        public String getWhiteMove() {
            return whiteMove;
        }

        public void setWhiteMove(String whiteMove) {
            this.whiteMove = whiteMove;
        }

        public String getBlackMove() {
            return blackMove;
        }

        public void setBlackMove(String blackMove) {
            this.blackMove = blackMove;
        }
    }

}
