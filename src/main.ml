let deps = [
    "dune";
    "zarith";
    "lambdasoup";
    "ppxlib";
    "mirage-crypto";
    "stdio";
    "ocamlfind";
    "ipaddr";
    "ocaml";
    "domain-name";
    "uarray";
    "stdlib-shims";
    "yojson";
    "uri";
    "bos";
    "faraday";
    "fmt";
    "ezjsonm";
    "core";
    "mtime";
    "alcotest";
    "base";
    "lwt";
    "containers";
    "ptime";
    "cohttp";
    "angstrom";
    "uutf";
    "ounit";
    "tyxml";
    "ppx_expect";
    "digestif";
    "hex";
    "re";
    "sexplib";
    "ppx_deriving";
    "cmdliner";
    "stringext";
    "async";
    "num";
    "findlib";
    "camlp-streams";
    "uunf";
    "logs";
    "easy-format";
    "fpath";
    "macaddr";
  ]

let () =
  Printf.printf "Loaded %d of %d opam dependencies.\n" (List.length deps) (List.length deps);
  List.iter print_endline deps;
  print_endline "Hello World from chaos!"
