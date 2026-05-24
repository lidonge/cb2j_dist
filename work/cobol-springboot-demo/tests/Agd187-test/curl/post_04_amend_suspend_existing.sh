#!/usr/bin/env bash
set -euo pipefail
BASE_URL="${BASE_URL:-http://localhost:8080}"
curl -sS -X POST "$BASE_URL/api/cobol-springboot-boc/agd187" \
  -H 'Content-Type: application/json' \
  --data-binary '@../schema-valid-full/04_amend_suspend_existing.json' | jq .
