package com.keatnis.screenmatch.mod;
// el parametro year es string y no int porque desde el archivo json se recibe con string

public record TituloOmdb(String title, String year, String runtime) {

}
